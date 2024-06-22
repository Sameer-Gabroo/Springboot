package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.entitiy.User;
import com.example.SpringBoot1.entitiy.journalEntity;
import com.example.SpringBoot1.service.journalEntityService;
import com.example.SpringBoot1.service.userEntityService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController //this is used to create End point in the form of methods

public class journalEntityControllerV2 {

@Autowired
private journalEntityService journalEntityService;

@Autowired
private userEntityService userEntityService;

    @GetMapping("/show/{username}")
    public List<journalEntity> getAll(@PathVariable String username) {
        User byUser = userEntityService.findByUserName(username);
        byUser.getJournalEntities();
        return journalEntityService.show() ;
    }

    @PostMapping("{username}")
    public boolean add(@RequestBody journalEntity myEntity,@PathVariable String username) {
        journalEntityService.save(myEntity,username);
        return true;
    }

//    We are using response Entity in this API
    @GetMapping("id/{myID}")
    public ResponseEntity<journalEntity> GetJournalEntityByID(@PathVariable ObjectId myID) {
        Optional<journalEntity> byId = journalEntityService.findById(myID);
        if (byId.isPresent()) {
            return new ResponseEntity<>(byId.get(), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>( HttpStatus.BAD_GATEWAY);
    }

    //    We are using response Entity in this API
    @DeleteMapping("id/{myID}")
    public ResponseEntity<Boolean> deleteJournalEntityByID(@PathVariable ObjectId myID,String name) {
         journalEntityService.deleteById(myID,name);
        return new ResponseEntity<>(true,HttpStatus.UNPROCESSABLE_ENTITY );
    }

//    @PutMapping("id/{myID}")
//    public journalEntity updateJournalEntityByID(@PathVariable ObjectId myID, @RequestBody journalEntity newEntry) {
//        journalEntity old = journalEntityService.findById(myID).orElse(null);
//        if(old !=null){
//            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().isEmpty() ? newEntry.getTitle():old.getTitle());
//            old.setContent(newEntry.getContent() != null && !newEntry.getContent().isEmpty() ? newEntry.getContent(): old.getContent());
//        };
//        journalEntityService.save(old);
//        journalEntity pu = old;
//        return pu;
//
//    }

    }








