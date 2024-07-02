package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.entitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.SpringBoot1.service.userEntityService;

import java.beans.Encoder;
import java.util.List;

@RestController //this is used to create End point in the form of methods
public class userController {
    @Autowired
    private userEntityService userEntityService;
    @Autowired
    private PasswordEncoder PasswordEncoder;

@GetMapping
public List<User> show()
{return userEntityService.show();
}

@PutMapping("/check")
public ResponseEntity<?> updateUser(@RequestBody User user) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    User userToUpdate = userEntityService.findByUserName(authentication.getName());
    if (!user.getUserName().equals(userToUpdate.getUserName())) {
        userToUpdate.setUserName(user.getUserName());
    }
    if (!user.getPassword().isEmpty()) {
        String encodedPassword = PasswordEncoder.encode(user.getPassword());
        userToUpdate.setPassword(encodedPassword);
    }
    userEntityService.save(userToUpdate);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
    }








