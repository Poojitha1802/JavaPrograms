package com.mypackage;

public class MethodTest {
	public void gradesTest(int marks) {
		if(marks>90)
			System.out.println("Grade is A");
		else if(marks>70)
			System.out.println("Grade is B");
		else
			System.out.println("Grade is C");
	}
	
public static void main(String[] args) {
	MethodTest student = new MethodTest();
	student.gradesTest(70);
}
}

