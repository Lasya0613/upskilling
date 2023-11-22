package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentModel;
import com.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		

	}

	

	public Object getStudentById(Long id) {
		
		return null;
	}

	public Object saveStudent(StudentModel student) {
		
		return null;
	}

	public void deleteStudent(Long id) {
		// 
		
	}



	public Object updateStudent(Long id, StudentModel updatedStudent) {
		
		return null;
	}

}
