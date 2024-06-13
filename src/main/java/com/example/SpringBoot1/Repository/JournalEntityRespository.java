package com.example.SpringBoot1.Repository;

import com.example.SpringBoot1.entitiy.journalEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntityRespository extends MongoRepository<journalEntity,String> {


}
