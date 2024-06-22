package com.example.SpringBoot1.entitiy;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Users")
@Data  // This is used to get all the methods like gettter setters and constuctors each and every thing
@NoArgsConstructor
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true)// to add the uniqe userName
    @NonNull // to add restriction forr adding not null value
    private String userName;
    @NonNull
    private String password;

    @DBRef
    private List<journalEntity> journalEntities= new ArrayList<>();

}