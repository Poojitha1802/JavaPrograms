package com.mypackage;

public class ToStringTest {
	public static void main(String[] args) {
	
	ToStringTest a = new ToStringTest();
	System.out.println(a);
	//by default ToString() method will be called, 
	//it gives the string representation of the object
	
	
	ToString2 b = new ToString2();
	System.out.println(b);
	//overrides toString method
	}
}

//Overriding toString method
class ToString2{
	@Override
	public String toString() {
		return "Inside ToSTring method";
	}
}