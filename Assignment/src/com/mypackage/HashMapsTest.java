package com.mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapsTest {
public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("abc","abc");
	map.put("xyz","xyz");
	map.put("the","th");
	map.put("the", "the");//new value will be overrided for the key "the", as the previous key has a value
	Set<String> s = map.keySet();
	Iterator<String>  it = s.iterator();
	while(it.hasNext())
	{
		String key=it.next();
		String value=map.get(key);
		
		System.out.println(key+": "+value);
	}
 
}
}
