package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.entitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.SpringBoot1.service.userEntityService;

import java.util.List;

@RestController //this is used to create End point in the form of methods
@RequestMapping("/bhai")

public class userController {


    @Autowired
    private userEntityService userEntityService;

@GetMapping("/allusers")
    public List<User> show(){
    return userEntityService.show();
}

@PostMapping("/adduser")
public void createuser(@RequestBody User user){
    userEntityService.save(user);
}

@PutMapping("/put")
    public ResponseEntity<?> updateUser(@RequestBody User user){
    User user1 = userEntityService.findByUserName(user.getUserName());
    if(user1 != null){
        user1.setUserName((user1.getUserName()));
        user1.setPassword(user1.getPassword());
        userEntityService.save(user1);
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
    }








