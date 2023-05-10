package com.example.likelion2.service;

import com.example.likelion2.entity.Todolist;
import com.example.likelion2.repository.TodolistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodolistService {
    private final TodolistRepository repository;
    public TodolistService(TodolistRepository repository){
        this.repository = repository;
    }

    public void saveList(Todolist todolist){
        repository.save(todolist);
    }

    public List<Todolist> getAllList(){
        return repository.findAll();
    }

    public void deleteList(Long id){
        repository.deleteById(id);
    }
}
