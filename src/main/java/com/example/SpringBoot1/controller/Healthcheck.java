package com.example.SpringBoot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {

   @GetMapping("/health-check")
   public String name(){
        return "Sameer as a gabroo Coming soon";
    }
}
