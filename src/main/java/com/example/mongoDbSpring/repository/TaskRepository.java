package com.example.mongoDbSpring.repository;

import com.example.mongoDbSpring.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
