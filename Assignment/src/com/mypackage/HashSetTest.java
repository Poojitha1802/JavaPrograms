package com.mypackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		//Names sorting using Hash Set
		//here duplicate entries won't be added to the list as of ArrayList
		Set<String> obj = new HashSet<String>();
		
	obj.add("pooja");
	obj.add("bindu");
	obj.add("pranathi");
	obj.add("sahaja");
	obj.add("pooja");
	Iterator<String> it = obj.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("size of list is: "+obj.size());
}
}
