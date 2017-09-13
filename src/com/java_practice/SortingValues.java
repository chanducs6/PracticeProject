package com.java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingValues {

	public static void main(String[] args) {
		
		List<Integer> value=new ArrayList<>();
		value.add(1785);
		value.add(584);
		value.add(57);
		value.add(757);
		value.add(1875);
		System.out.println("before sorting ");
		for (int i = 0; i < value.size(); i++) {
			System.out.println(value.get(i));

		}
		int temp=0;
		
		Collections.sort(value);
		
		int[] value1 = {12,54,45,74,1,2,44,55,41};
		System.out.println("before sorting the vlues are : "+value1);
		
		int n = value1.length;
		for (int i = 0; i <n; i++) {

			for (int j = 1; j < (n-i); j++) {
				
				if(value1[j-1]>value1[j]){
					temp = value1[j-1];
					value1[j-1]=value1[j];
					value1[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting the vlues are : "+value1);

		
		for (int i = 0; i < value.size(); i++) {
			System.out.println("after sorting "+value.get(i));

		}		
		
		
		/*Arrays.sort(value);
		System.out.println("After sorting ");
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);

		}*/
	}
}
