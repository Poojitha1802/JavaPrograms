package com.mypackage;

public class Inheritance {
	public static void main(String[] args) {
	Bike1 b = new Bike1();
	b.info();
	b.model();
	}
}

//Parent Class
class Vehicle1{
	public void info() {
		System.out.println("Bike and Scooters");
	}	
}

//Child class
class Bike1 extends Vehicle1
{
	public void model() {
		System.out.println("Apache");
	}
}