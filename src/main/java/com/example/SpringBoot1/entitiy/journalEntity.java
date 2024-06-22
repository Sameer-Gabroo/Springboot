package com.example.SpringBoot1.entitiy;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journal_Entity")
@Data  // This is used to get all the methods like gettter setters and constuctors each and every thing
@Getter  // this is how we can getter and setters
@Setter
@NoArgsConstructor
@ToString //this is hoe we can add To string method

public class journalEntity {
    @Id
    private ObjectId id;
    private String title;
    private String content;

}