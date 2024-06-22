package com.example.SpringBoot1.Repository;

import com.example.SpringBoot1.entitiy.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User,ObjectId >{
    User findByUserName(String userName);
}
