package com.pack.test;

import java.util.Map;

import freemarker.ext.util.IdentityHashMap;

public class DuplicateKeyTestInMap {

	public static void main(String[] args) {
		
		Map<Integer, String> data = new IdentityHashMap();
		
		Integer a1 = new Integer(1);
		Integer a2 = new Integer(1);
		Integer a3 = new Integer(1);
		Integer a4 = new Integer(1);
		Integer a5 = new Integer(1);
		
		data.put(a1, "1");
		data.put(a2, "1");
		data.put(a3, "1");
		data.put(a4, "1");
		data.put(a5, "1");
		data.put(1, "1");
		
		System.out.println(data);
		
				
		
	}
}
