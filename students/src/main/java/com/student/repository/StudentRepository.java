package com.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.StudentModel;
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

}
