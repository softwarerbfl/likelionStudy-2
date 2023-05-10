package com.example.likelion2.repository;

import com.example.likelion2.entity.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodolistRepository extends JpaRepository<Todolist, Long> {
}
