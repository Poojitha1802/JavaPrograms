package com.mypackage;

public class ThisTest {
public static void main(String[] args) {
	Human h1 = new Human("pooja",23, "IL");
	Human h2 = new Human("bindu", 24, "VA");
	h1.info1();
	h2.info1();
}
}

class Human
{
	String name;
	int age;
	String address;
	Human(String name, int age, String address){
		//this is a refrence variable that refers to the current object
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void info1() {
		System.out.println("name: "+name+ " age: "+ age );
		System.out.println("Address: " + address);
		}
}