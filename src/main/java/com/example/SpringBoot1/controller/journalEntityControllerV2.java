package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.entitiy.journalEntity;
import com.example.SpringBoot1.service.journalEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //this is used to create End point in the form of methods
@RequestMapping("/bhai")

public class journalEntityControllerV2 {

@Autowired
private journalEntityService journalEntityService;

    @GetMapping()
    public List<journalEntity> getAll() {
        return null;
    }

    @PostMapping()
    public boolean add(@RequestBody journalEntity myEntity) {
        journalEntityService.save(myEntity);
        return true;
    }

    @GetMapping("id/{myID}")
    public journalEntity GetJournalEntityByID(@PathVariable Long myID) {
        return null;
    }

    @DeleteMapping("id/{myID}")
    public journalEntity deleteJournalEntityByID(@PathVariable Long myID) {
        return null;
    }

    @PutMapping("id/{myID}")
    public journalEntity updateJournalEntityByID(@PathVariable Long id, @RequestBody journalEntity myEntity) {
        return null;
    }

}
