package com.mypackage;

public class StaticVariablesTest {
public static void main(String[] args) {
	AptMems a1 = new AptMems("Sahaja", 18);
	AptMems a2 = new AptMems("Bindu", 1);
	AptMems a3 = new AptMems("Pooja", 5);
	
	a1.info();
	a2.info();
	a3.info();
}
}

class AptMems{
	//Non-Static variables
	String people;
	int flatNo;
	//Static variables
	static String apartmentName="516 South Poplar";
	
	AptMems(String p,int f){
		people=p;
		flatNo=f;
	}
	
	public void info() {
		System.out.println("Member "+ people);
		System.out.println("Apartment no "+flatNo);
		System.out.println("Apartment name "+apartmentName);
	}
}