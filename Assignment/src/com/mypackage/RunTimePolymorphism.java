package com.mypackage;

public class RunTimePolymorphism {
public static void main(String[] args) {
	//RunTimePolymorphism
	Vehicle v = new Vehicle();
	System.out.println("In parent class");
	v.info();
	v.model();
	System.out.println("MethodOverriding");
	System.out.println("In child class");
	Bike b = new Bike();
	//overrides the parent class method
	b.model();
	Scooter s = new Scooter();  
	//overrides the parent class method
	s.model();
}
}

class Vehicle
{
	void info() {
		System.out.println("Bike and Scooters");
	}
	void model() {
		System.out.println("Bikes-Apache");
		System.out.println("Scooter-Vespa");
	}
}

class Bike extends Vehicle
{
	void model() {
		System.out.println("Apache");
	}
}

class Scooter extends Vehicle
{
	void model() {
		System.out.println("Vespa");
	}
}