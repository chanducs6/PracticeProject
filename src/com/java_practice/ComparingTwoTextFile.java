
package com.java_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class ComparingTwoTextFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\E002466\\Desktop\\text.txt"));
		List<String> set = new ArrayList<String>();
		String str;
		
		while ((str=in.readLine())!=null) {
		set.add(str);
		}
		System.out.println(set);
		
		BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\E002466\\Desktop\\textToCmpr.txt"));
		List<String> set2 = new ArrayList<String>();
		String str1;
		
		while ((str1=out.readLine())!=null) {
		set2.add(str1);
		}
		System.out.println(set2);
		
	/*for(String abc : set){
		for(String bc : set2)
		{
			if(abc.equals(bc)){
				System.out.println( abc +"the given data is matching with " +bc);
				break;
			}
		}
	}
*/	
	String s1[]= new String[set.size()];
	String s2[]= new String[set2.size()];
	
	Iterator <String>ite= set.iterator();
	int i=0;
	while(ite.hasNext())
	{
		s1[i]= ite.next();
		i++;
	}	
	Iterator <String>iter= set2.iterator();
	int j=0;
	while(iter.hasNext())
	{
		s2[j]= iter.next();
		j++;
	}
	
		
	for(int k=0;k<set.size();k++)
	{
		for(int l=0;l<set2.size();l++)
		{
		
			if(s1[k].equalsIgnoreCase(s2[l]))
			{
				System.out.println(s1[k]+" is displayed at "+ (l+1) +"th row in file textToCmpr.txt file");
				break;
			}
			
		}
	}
	
	
	
	}
}

