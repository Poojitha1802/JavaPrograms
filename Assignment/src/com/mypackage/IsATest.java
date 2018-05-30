package com.mypackage;

public class IsATest {
public static void main(String[] args) {
	Emp e = new Emp();
	System.out.println("Name: "+ e.name);
	System.out.println("Address: "+ e.address);
	System.out.println("Salary: "+ e.salary);
}
}
//here Individual IS-A Employee

//Parent class
class Individual{
	
	String name="pooja";
	String address="Carbondale";
	
}

//Child class
class Emp extends Individual{
	int salary=10000;
}