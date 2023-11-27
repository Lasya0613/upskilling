package com.microservices.controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bean.Student;

@RestController
public class StudentController {
	
	@GetMapping("student")
	public ResponseEntity<Student> getStudent() {
		
		Student student = new Student(1,"lasya","priya");
		//return new ResponseEntity<>(student,HttpStatus.OK);
		return ResponseEntity.ok().header("custom-header","ram").body(student);
	}
	
	@GetMapping("students")
	public ResponseEntity<List<Student>> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"archana","Bharagavi"));
		students.add(new Student(2,"teju","maddhuri"));
		students.add(new Student(1,"datta","vimal"));
		students.add(new Student(1,"Ramya","sri"));
		return ResponseEntity.ok(students);
	}
	
	
	@GetMapping("students/{id}")
	public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int id) {
		Student student= new Student(id,"archana","Bhargavi" );
		return ResponseEntity.ok(student);
	}
	
	
	//http:localhost:8080/students/query?id=1
	
	@GetMapping("students/query")
	public ResponseEntity<Student> studentRequestVariable(@RequestParam int id) {
		Student student= new Student(id,"archana","Bhargavi");
		return ResponseEntity.ok(student);
	}
	
	
	@PostMapping("students/create")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return new ResponseEntity<>(student, HttpStatus.CREATED);
		
	}
	
	@PutMapping("students/{id}/update")
	
	public  ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId) {
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return  ResponseEntity.ok(student);
	}
	
	@DeleteMapping("students/{id}/delete")
	public ResponseEntity<String> deleteStudent(@PathVariable ("id") int studentId) {
		System.out.println(studentId);
		return ResponseEntity.ok("student deleted successfully");
	}
	
}
