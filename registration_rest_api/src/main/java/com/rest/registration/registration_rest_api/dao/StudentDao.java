package com.rest.registration.registration_rest_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.registration.registration_rest_api.entities.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

}
