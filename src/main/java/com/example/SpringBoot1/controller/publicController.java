package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.entitiy.User;
import com.example.SpringBoot1.service.userEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class publicController {

    @Autowired
    private com.example.SpringBoot1.service.userEntityService userEntityService;

    @Autowired
    private org.springframework.security.crypto.password.PasswordEncoder PasswordEncoder;



   @GetMapping("/health-check")
   public String name(){
        return "Sameer as a gabroo Coming soon";
    }

    @PostMapping("/adduser")
    public void createuser(@RequestBody User user){
        user.setPassword(PasswordEncoder.encode(user.getPassword()));
        userEntityService.save(user);
    }
}
