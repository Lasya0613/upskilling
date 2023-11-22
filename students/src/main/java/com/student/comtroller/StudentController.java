package com.student.comtroller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

import com.student.entity.StudentModel;
import com.student.service.StudentService;
	 
	@RestController
	@RequestMapping("/students")
	public class StudentController {
	    @Autowired
	    private StudentService studentService;
	 
	    @PostMapping
	    public ResponseEntity<StudentModel> addStudent(@RequestBody StudentModel student) {
	        // Implement logic to save a new student
	        return ResponseEntity.ok(studentService.saveStudent(student));
	    }
	 
	    @GetMapping("/{id}")
	    public ResponseEntity<Object> getStudentById(@PathVariable Long id) {
	        // Implement logic to retrieve a student by ID
	        return ResponseEntity.ok(studentService.getStudentById(id));
	    }
	 
	    @PutMapping("/{id}")
	    public ResponseEntity<StudentModel> updateStudent(@PathVariable Long id, @RequestBody StudentModel updatedStudent) {
	        // Implement logic to update a student
	        return ResponseEntity.ok(studentService.updateStudent(id, updatedStudent));
	    }
	 
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
	        // Implement logic to delete a student
	        studentService.deleteStudent(id);
	        return ResponseEntity.noContent().build();
	    }
	}