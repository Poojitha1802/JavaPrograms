package com.mypackage;

public class LocalVariables {
	public void local() {
		//Here "a" is local to this method
		//It can't be accessed outside this method
		int a = 150;
		System.out.println("Local variable a= "+a);
	}
	
public static void main(String[] args) {
	LocalVariables b= new LocalVariables();
	b.local();
	
}
}