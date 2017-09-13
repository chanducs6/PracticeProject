package com.pack.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map< String , String> data = new HashMap<>();
		data.put("1", "my name ");
		data.put("2", "is ");
		data.put("3", "khan ");
		data.put("4", "but");
		data.put("5", "I am not a ");
		data.put("6", "Terrorist");
		
		Set<String> value = data.keySet();
		
		for(String s : value){
			
			System.out.println(data.get(s));
		}
		
	}
}
