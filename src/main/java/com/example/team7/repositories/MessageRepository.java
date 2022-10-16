package com.example.team7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.team7.entities.Message;

public interface MessageRepository  extends JpaRepository<Message, Integer>{
}
