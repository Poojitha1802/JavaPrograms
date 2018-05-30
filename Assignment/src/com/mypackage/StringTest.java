package com.mypackage;

public class StringTest {
	public static void main(String[] args) {
		//equals
		System.out.println("equals");
		String a1=new String("gb");
		String a2=new String("gb");
		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		
		String l1="pj";
		String l2="pj";
		System.out.println(l1.equals(l2));
		System.out.println(l1==l2);
		
		String s1="abc";
		s1=s1.concat("def");
		//here pool has two literals now, though s1 has a new concated iteral
		System.out.println("concat "+s1);
		
		//to Upper case
		String s2="pj";
		String s3= s2.toUpperCase();
		System.out.println("upper case "+s3);
		
		//tolowercase
		String s4 ="POOja";
		String s5 = s4.toLowerCase();
		System.out.println("lower case "+s5);
		
		//contains
		String s6="hey you!";
		System.out.print("contains ");
		System.out.println(s6.contains("y y"));
		System.out.println(s6.contains("   "));
		//returns true if present
		
		//index of
		String s7="hello hi how are you hi";
		System.out.print("index of ");
		System.out.println(s7.indexOf("are")); 
		//index of string
		System.out.println(s7.indexOf("h")); 
		//index of char
		System.out.println(s7.indexOf("h", 4)); 
		//index of char after some index no
		System.out.println(s7.lastIndexOf("hi")); 
		//gives last index of that string
		System.out.println(s7.lastIndexOf("hi", 8));
		//splits string into diff ones till the given index and searches in the frst one
	}
}
