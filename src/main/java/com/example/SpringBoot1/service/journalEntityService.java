package com.example.SpringBoot1.service;

import com.example.SpringBoot1.Repository.JournalEntityRespository;
import com.example.SpringBoot1.entitiy.User;
import com.example.SpringBoot1.entitiy.journalEntity;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.PrimitiveIterator;

@Component
public class journalEntityService {

    @Autowired
    private JournalEntityRespository JournalEntityRepository;

    @Autowired
    private userEntityService userEntityService;

    public void save(journalEntity journalEntity,String name){
        User user = userEntityService.findByUserName(name);
        journalEntity save = JournalEntityRepository.save(journalEntity);
        user.getJournalEntities().add(journalEntity);
       userEntityService.save(user);
    }

    public List<journalEntity> show(){
       return JournalEntityRepository.findAll();
    }

    public Optional<journalEntity> findById(ObjectId id){
        return JournalEntityRepository.findById(id);
    }
    public void deleteById(ObjectId id,String name){
        User user = userEntityService.findByUserName(name);
        user.getJournalEntities().removeIf(x -> x.getId().equals(id));
        userEntityService.save(user);
        JournalEntityRepository.deleteById(id);
    }

}
