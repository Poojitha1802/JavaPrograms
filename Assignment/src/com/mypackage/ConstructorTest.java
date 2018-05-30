package com.mypackage;

public class ConstructorTest {
public static void main(String[] args) {
	System.out.println("Constructors");
	Dept d = new Dept();
	Dept d1 = new Dept(1, "Admins");
	Dept d2 = new Dept(2,"Marketing");
	Dept d3 = new Dept(3,"Developers");
}
}

class Dept{
	Dept(){
		System.out.println("Departments");
	}
	Dept(int id, String name){
		System.out.println("Department id is "+id);
		System.out.println("Department name is "+name);
	}
}