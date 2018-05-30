package com.mypackage;

public class InstanceVariables {
	//Instance variable
	int sum;
	public void method() {
		int a = 150;
		int b=20;
		sum=a+b;
	}
	
public static void main(String[] args) {
	InstanceVariables b= new InstanceVariables();
	System.out.println(b.sum);
	b.method();
	System.out.println(b.sum);
}
}
