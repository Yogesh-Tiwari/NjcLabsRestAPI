package com.rest.registration.registration_rest_api.services;

import java.util.List;

import com.rest.registration.registration_rest_api.entities.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public Student addStudent(Student stu);
	
}
