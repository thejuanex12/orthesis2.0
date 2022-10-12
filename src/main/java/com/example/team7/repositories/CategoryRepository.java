package com.example.team7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.team7.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Integer>{
}
