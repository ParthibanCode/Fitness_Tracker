package com.example.fitnesstracker.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.fitnesstracker.entity.Appointment;
import com.example.fitnesstracker.service.AppointmentService;

@RestController
public class AppointmentController {
	
	@Autowired
	AppointmentService appService;
	
	@GetMapping("/appointment")
	Iterable<Appointment> getAppointments() {
	      return appService.getAppointments();
	 }
	@GetMapping("/appointment/{id}")
	Optional<Appointment> getAppointments(@PathVariable("id")Integer id){
		return appService.getappointment(id);
	}

	@PostMapping("/appointment")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createAppointment(@RequestBody @Valid Appointment appointment) {
		appService.saveAppointment(appointment);
	}

}
