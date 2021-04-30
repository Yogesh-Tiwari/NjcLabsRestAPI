package com.rest.registration.registration_rest_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.registration.registration_rest_api.dao.StudentDao;
import com.rest.registration.registration_rest_api.entities.Student;


@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	public StudentDao studentDao;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id).get();
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student toDelete = studentDao.findById(id).get();
		studentDao.delete(toDelete);
	}

	@Override
	public Student addStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentDao.save(stu);
	}

}
