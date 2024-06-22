package com.example.SpringBoot1.Repository;

import com.example.SpringBoot1.entitiy.journalEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntityRespository extends MongoRepository<journalEntity, ObjectId> {


}
