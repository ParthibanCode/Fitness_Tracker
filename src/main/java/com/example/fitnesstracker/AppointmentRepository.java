package com.example.fitnesstracker;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnesstracker.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
