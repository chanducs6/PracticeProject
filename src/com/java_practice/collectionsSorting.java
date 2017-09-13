package com.java_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class collectionsSorting {

	
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();  
		al.add(99);  
		al.add(101);  
		al.add(65);  
		al.add(98); 
		al.add(99);  
		al.add(101);  
		al.add(65);  
		al.add(98);
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()){
			
			String ab = itr.next().toString();
			System.out.println(ab);
		}
		  System.out.println("before sorting ");
		  for(Integer ab : al){
			  System.out.println(ab);
		  }
		  Collections.sort(al);
		 System.out.println("after sorting in ascending order");
		  for(Integer ab : al){
			  System.out.println(ab);
		  }
		  
		  Collections.sort(al ,Collections.reverseOrder());
			 System.out.println("after sorting in descending order");
			  for(Integer ab : al){
				  System.out.println(ab);
			  }
	}
	
}
