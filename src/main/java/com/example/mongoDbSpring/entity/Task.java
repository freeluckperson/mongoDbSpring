package com.example.mongoDbSpring.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;


@Data
@Document(collection = "todo")
public class Task {
    @Id
    String id;
    String title;
    String description;
}



