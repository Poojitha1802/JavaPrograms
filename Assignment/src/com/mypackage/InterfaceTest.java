package com.mypackage;

public class InterfaceTest{
public static void main(String[] args) {
	Student1 s1 = new Student1();
	Student2 s2 = new Student2();
	s1.grades();
	s2.grades();
}
}

interface GradesInfo{
	public void grades();
}

class Student1 implements GradesInfo{
	String grade="A";

	@Override
	public void grades() {
		System.out.println("Grade of Student1: "+grade);
		
	}
	
}
class Student2 implements GradesInfo{
	String grade="B";
	@Override
	public void grades() {
		System.out.println("Grade of Student2: "+grade);
		
	}
	
}