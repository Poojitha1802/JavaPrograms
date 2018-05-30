package com.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//Names sorting
		//Duplicate entries will be added to the list
		List<String> list = new ArrayList<String>();
		list.add("pooja");
		list.add("sahaja");
		list.add("bindu");
		list.add("pranathi");
		list.add("pooja");
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		int b=list.size();
		System.out.println("size of array list is: "+b);
	}
}
