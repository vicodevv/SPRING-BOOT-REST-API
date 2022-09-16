package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
		return List.of(
				new Student(
						1L,
						"Victor Omoniyi",
						21,
						LocalDate.of(2001, Month.JULY, 13), 
						"vomoniyi2001@gmail.com"
				));
	}
}
