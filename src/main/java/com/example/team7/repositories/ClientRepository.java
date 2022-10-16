
package com.example.team7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.team7.entities.Client;



public interface ClientRepository  extends JpaRepository<Client, Integer>{
}
