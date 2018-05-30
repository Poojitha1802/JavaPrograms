package com.mypackage;

public class ArrayTest {
public static void main(String[] args) {
	//Declaring an int array
	int a[]= new int[5];
	a[0]=5;
	a[1]=10;
	a[3]=15;
	
	//Declaring and initialization of String array
	String b[]= {"Declaration","of","String","Array"};
	
	for(int i=0; i<a.length; i++)
	System.out.println(a[i]);
	
	for(int i=0;i<b.length;i++)
	System.out.println(b[i]);
	
}
}
