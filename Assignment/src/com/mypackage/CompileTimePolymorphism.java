package com.mypackage;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		//Types of Overloading
		// Constructor overloading
		System.out.println("Constructor overloading");
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5, 3);

		// Method overloading
		System.out.println("Method overloading");
		DiffAreas s = new DiffAreas();
		s.area();
		s.area(9);
		s.area(7, 5);

		// Operator Overloading
		System.out.println("Operator Overloading");
		int a, b;
		a = 2;
		b = 4;
		String c = "hey";
		System.out.println("Conactenation of a string and an integer using + operator");
		System.out.println(c + a);
		System.out.println("Addition of two integer using + operator");
		System.out.println(a + b);
	}
}

// ConstructorOverloading
class Rectangle {
	int l, b;
	int area;

	Rectangle() {
		System.out.println("inside rectangle with zero arguments");
	}

	Rectangle(int l, int b) {
		area = l * b;
		System.out.println("area of rectangle= " + area);
	}
}

// MethodOverloading
class DiffAreas {
	void area() {
		System.out.println("inside zero argument area method");
	}

	void area(int s) {
		int area = s * s;
		System.out.println("Area of square is = " + area);
	}

	void area(int l, int b) {
		int area = l * b;
		System.out.println("Area of rectangle is = " + area);
	}
}
