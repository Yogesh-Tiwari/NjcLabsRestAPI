package com.rest.registration.registration_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.registration.registration_rest_api.entities.Student;
import com.rest.registration.registration_rest_api.services.StudentService;

@RestController
public class Controller {
	
	@Autowired
	public StudentService service;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return this.service.getAllStudents();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return this.service.addStudent(student);
	}
	
	@GetMapping("/students/{studentId}")
	public Student getSingleStudent(@PathVariable String studentId) {
		return this.service.getStudent(Integer.parseInt(studentId));
	}
	
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId) {
		try {
			this.service.deleteStudent(Integer.parseInt(studentId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
}
