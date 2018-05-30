package com.mypackage;

public class HasATest {
public static void main(String[] args) {
	Address add1= new Address("516S", "Carbondale", "IL");
	Person1 p1 = new Person1("pooja", 23, add1);
	p1.info1();
}
}

class Person1{

	String name;
	int age;
	Address address;
	
	Person1(String name, int age, Address address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void info1() {
	System.out.println("name: "+name+ " age: "+ age );
	System.out.println("Address: " +address.lane+" "+address.city+" "+address.state);
	}
		
	
}

class Address{
	String lane;
	String city;
	String state;
	Address(String lane, String city, String state){
		this.lane=lane;
		this.city=city;
		this.state=state;
	}
}