package com.mballem.curso.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mballem.curso.boot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
