package com.example.likelion2.controller;

import com.example.likelion2.dto.TodolistDto;
import com.example.likelion2.entity.Todolist;
import com.example.likelion2.service.TodolistService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodolistController {
    private final TodolistService service;

    public TodolistController(TodolistService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Todolist saveList(@RequestBody TodolistDto dto) {
        Todolist todolist = new Todolist();
        todolist.setDetail(dto.getDetail());
        service.saveList(todolist);
        return todolist;
    }

    @GetMapping("/list")
    public List<Todolist> getAllList() {
        List<Todolist> list = service.getAllList();
        return list;
    }

    @DeleteMapping("/delete")
    public void deleteList(@RequestParam Long id) {
        service.deleteList(id);
    }
}
