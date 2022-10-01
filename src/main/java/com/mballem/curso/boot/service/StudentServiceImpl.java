package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballem.curso.boot.model.Student;
import com.mballem.curso.boot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentrepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentrepository.findAll();
	}

}
