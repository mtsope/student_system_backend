package com.mballem.curso.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mballem.curso.boot.model.Student;
import com.mballem.curso.boot.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student)
	{
		studentservice.saveStudent(student);
		
		return "New Student idd added into the database";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents()
	{
		return studentservice.getAllStudents();
		
	}

}
