package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
@Id
long id;
String name;
int age;
int salary;



	public StudentModel(long id, String name, int age, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}



	public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public int getSalary() {
	return salary;
}



public void setSalary(int salary) {
	this.salary = salary;
}



	public static void main(String[] args) {
		
	}

}
