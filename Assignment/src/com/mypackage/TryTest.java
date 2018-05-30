package com.mypackage;

public class TryTest {
	public static void main(String[] args) {
		//Try catch
		try {
			int  a;
			a=3/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception in try block");
			e.printStackTrace();
		}
		finally {
			System.out.println("Arithmetic operation");
		}
}
}