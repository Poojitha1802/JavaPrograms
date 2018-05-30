package com.mypackage;

public class Test {
	//this is visible everywhere
	public void info() {
		System.out.println("Inside Public method in Test Class");
	}

	protected void info1() {
		System.out.println("Inside Protected method  in Test Class");

	}
	//this can be accessed only within this class
	private void info2() {
		System.out.println("Inisde private method in Test Class");
	}
	
	void info3() {
		System.out.println("Inisde default method in Test Class");
	}
}

class A{
	public static void main(String[] args) {
		Test t = new Test();
		//protected=accessible within package and in inherited class
		t.info1();
		//default=accessible only within package
		t.info3();
	}
}