package com.java_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileEditingWithEmailID {

	public static void main(String[] args) throws IOException {

		BufferedReader EmailFile = new BufferedReader(new FileReader("C:/Users/E002466/Desktop/Emailid.txt"));
		List<String> ListEmailId = new ArrayList<String>();
		String str;
		List<String> FinalList = new ArrayList<String>();
		while ((str=EmailFile.readLine())!=null) {
			ListEmailId.add(str);
		}
		System.out.println(ListEmailId);
		
		BufferedReader Details = new BufferedReader(new FileReader("C:/Users/E002466/Desktop/detailsToFill.txt"));
		List<String> DetailList2 = new ArrayList<String>();
		String str1;
		
		while ((str1=Details.readLine())!=null) {
			DetailList2.add(str1);
		}
		System.out.println("+++++++++++++++"+DetailList2);
		System.out.println(DetailList2.size());

		int x=0;
		for (int i = 0; i < DetailList2.size(); i++) {
			
			try{
			if(DetailList2.get(i).length()!= 0){
				System.out.println(DetailList2.get(i));
			if(DetailList2.get(i).contains("Emailid:")){
				FinalList.add("Emailid: "+ListEmailId.get(x));
				x++;
				
			}else{
				FinalList.add(DetailList2.get(i));
			}
			}
			}catch (Exception e) {
            System.out.println(e);
            }
			
		}
		
		BufferedWriter write = new BufferedWriter(new FileWriter("C:/Users/E002466/Desktop/detailsToFill.txt"));
		for (int i = 0; i < FinalList.size(); i++) {
			
		
			if(FinalList.get(i).contains("Address")){
				write.write(FinalList.get(i));
				write.newLine();
				write.write("\r\n");		
			}else{
				write.write(FinalList.get(i));
				write.newLine();
			}
			
			
			
		}
					
		write.flush();
		write.close();
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
	/*String s1[]= new String[set.size()];
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
	
	}*/
	}
}
