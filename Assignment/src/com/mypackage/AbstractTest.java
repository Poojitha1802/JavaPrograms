package com.mypackage;

public class AbstractTest {
	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student4 s2 = new Student4();
		s1.grades();
		s2.grades();
}
}

	abstract class GradeInfo{
		//abstract method
		abstract public void grades();
		
	}

	class Student3 extends GradeInfo{
		String grade="A";

		@Override
		public void grades() {
			System.out.println("Grade of Student1: "+grade);
			
		}
		
	}
	class Student4 extends GradeInfo{
		String grade="B";
		@Override
		public void grades() {
			System.out.println("Grade of Student2: "+grade);
			
		}
		
}
