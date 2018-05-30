package com.mypackage;

public class IfLoop {
	public static void main(String []args){
        
		int a,b,c;
		a=-7;
		b=-8;
		c=-1;
		System.out.println("a="+a+" b="+b+" c="+c);
		if(a>b && a>c)
		{
		System.out.println("a is greater");
		}
		else if(b>=c && b>=a){
		System.out.println("b is greater");
		}
		else if(c>=a && c>=b){
		System.out.println("c is greater");
		}
		}
}
