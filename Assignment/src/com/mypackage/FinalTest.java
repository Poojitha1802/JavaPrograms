package com.mypackage;

public class FinalTest {
	final void info() {
		System.out.println("inside parent class");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.info();
	}
}

final class Person extends FinalTest{
	//final variable
	final int id = 01;
	
	//final method
	//can't override the final method in parent class
	/*public void info() {
		//id=90;
		//can't change final variable "id"
		System.out.println(id);
		
	}*/
}

//final class
//Can't extend class Person as it is declared final
//class Employeee extends Person {
	//}