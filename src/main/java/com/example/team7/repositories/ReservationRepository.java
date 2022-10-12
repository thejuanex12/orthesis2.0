package com.example.team7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.team7.entities.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Integer>{
}
