package com.example.fitnesstracker.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitnesstracker.AppointmentRepository;
import com.example.fitnesstracker.entity.Appointment;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepo;
	
	public Iterable<Appointment> getAppointments() {
		return appointmentRepo.findAll();
	}

	public Optional<Appointment> getappointment(Integer id) {
		return appointmentRepo.findById(id);
	}

	public void saveAppointment(@Valid Appointment appointment) {
		appointmentRepo.save(appointment);

	}

}
