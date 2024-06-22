package com.example.SpringBoot1.service;

import com.example.SpringBoot1.Repository.JournalEntityRespository;
import com.example.SpringBoot1.Repository.UserRepository;
import com.example.SpringBoot1.entitiy.User;
import com.example.SpringBoot1.entitiy.journalEntity;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class userEntityService {

    @Autowired
    private UserRepository UserRepository;

    public void save(User User){
        UserRepository.save(User);
    }

    public List<User> show(){
       return UserRepository.findAll();
    }

    public User findByUserName(String userName){
        return UserRepository.findByUserName(userName);
    }
    public Optional<User> findById(ObjectId id) {
        return UserRepository.findById(id);


    }
    public void deleteById(ObjectId id){
        UserRepository.deleteById(id);
    }

}
