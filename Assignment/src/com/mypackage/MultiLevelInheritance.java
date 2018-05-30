package com.mypackage;

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Car c = new Car();
		c.info();
		c.model();
		c.name();
	}
}

// MultiLevel Inheritance
class Automobile {
	public void info() {
		System.out.println("Cars");
	}
}

class Engine extends Vehicle1 {
	public void model() {
		System.out.println("Engine no:111");
	}
}

class Car extends Engine {
	public void name() {
		System.out.println("duster");
	}
}