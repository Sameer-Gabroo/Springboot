package com.example.SpringBoot1.service;

import com.example.SpringBoot1.Repository.JournalEntityRespository;
import com.example.SpringBoot1.entitiy.journalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.PrimitiveIterator;

@Component
public class journalEntityService {

    @Autowired
    private JournalEntityRespository JournalEntityRepository;

    public void save(journalEntity journalEntity){
        JournalEntityRepository.save(journalEntity);
    }
}
