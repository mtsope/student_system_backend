package com.mballem.curso.boot.service;

import java.util.List;

import com.mballem.curso.boot.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
}
