package com.mypackage;

public class NonStaticVariables {
	public static void main(String[] args) {
	AptMems1 a1 = new AptMems1("Sahaja", 18);
	AptMems1 a2 = new AptMems1("Bindu", 1);
	AptMems1 a3 = new AptMems1("Pooja", 5);
	
	//static method
	AptMems1.staticInfo();
	
	//non-static methods
	a1.info();
	a2.info();
	a3.info();
}
}

class AptMems1{
	
	//Non-Static variables
	String people;
	int flatNo;
	
	//Static variables
	static String apartmentName="516 South Poplar";
	
	AptMems1(String p,int f){
		people=p;
		flatNo=f;
	}
	
	//non static method
	public void info() {
		System.out.println("Member: "+ people);
		System.out.println("Apartment no: "+flatNo);
		System.out.println("Apartment name: "+apartmentName);
	}
	
	//static method
	static void staticInfo() {
		System.out.println("Displaying all the Flat members and their details");
	}
}