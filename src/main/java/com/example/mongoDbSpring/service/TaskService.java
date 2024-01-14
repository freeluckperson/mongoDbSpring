package com.example.mongoDbSpring.service;

import com.example.mongoDbSpring.entity.Task;
import com.example.mongoDbSpring.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTask(String id) {
        return taskRepository.findById(id);
    }

    public Task createOrUpdate(Task task) {
        return taskRepository.save(task);
    }

    public void eraseTask(String id) {
        taskRepository.deleteById(id);
    }
}
