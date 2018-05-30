package com.myaccessmodifiers;

import com.mypackage.Test;

public class AccessModifiersTest extends Test {
public static void main(String[] args) {
	
	
	
	AccessModifiersTest a = new AccessModifiersTest();
	//this is protected and can be accessed only if its inherited
	a.info1();
	//public can be accessed anywhere
	a.info();
	//private method, can't be accessed in this class
	//a.info2();
	//default, only within package
	//a.info3();
	
}
}
