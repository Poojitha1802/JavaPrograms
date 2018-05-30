package com.mypackage;

public class ExceptionTest {
	public static void main(String[] args) {
		//try catch 
		try {
			int  a;
			a=3/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception in try block");
			//e.printStackTrace();
		}
		finally {
			System.out.println("Arithmetic operation");
		}
		
		//throw- used to create an exception intentionally
		System.out.println("hey");
	}
}
