package com.mypackage;

public class SuperTest {
	public static void main(String[] args) {
		Bike2 b = new Bike2();
		b.info();
		b.model();
		b.countModel();
		}
	}

	//Parent Class
	class Vehicle2{
		int models=1;
		
		Vehicle2(){
			System.out.println("Inside vehicle constructor");
		}
		
		public void info() {
			System.out.println("This class contains info of all vehicles");
		}	
		
		
	}

	//Child class
	class Bike2 extends Vehicle2
	{
		int models=2;
		Bike2(){
			//to call parent class constructor
			super();
			System.out.println("inside bike constructor");
		}
		
		//super keyword for parent class method
		public void info() {
			super.info();
			System.out.println("This contains only Bikes");
		}
		
		public void model() {
			System.out.println("Apache");
		}
		
		
		//super keyword for parent class variables
		public void countModel() {
			System.out.println(models);
			System.out.println(super.models);
			//gets parent class instance variable
		}
}