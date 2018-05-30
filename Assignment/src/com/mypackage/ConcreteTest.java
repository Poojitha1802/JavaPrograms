package com.mypackage;

public class ConcreteTest {
	public static void main(String[] args) {
		Student5 s1 = new Student5();
		Student6 s2 = new Student6();
		s1.grades();
		s1.info();
		s2.grades();
}
}

	abstract class GradeInf{
		//abstract method
		abstract public void grades();
		//concrete method
		public void info() {
			System.out.println("student is performing well");
		}
	}

	class Student5 extends GradeInf{
		String grade="A";

		@Override
		public void grades() {
			System.out.println("Grade of Student1: "+grade);
			
		}
		
	}
	class Student6 extends GradeInf{
		String grade="B";
		@Override
		public void grades() {
			System.out.println("Grade of Student2: "+grade);
			
		}
		
}
