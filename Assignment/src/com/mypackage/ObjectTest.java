package com.mypackage;

public class ObjectTest {
	public static void main(String[] args) {
		
   //Creating an object for class Student
	Student s1 = new Student();
	s1.id=1;
	s1.name="ajay";
	System.out.println("Student Id "+s1.id);
	System.out.println("Student name "+ s1.name);
	}
}

class Student{
	int id;
	String name;	
}
