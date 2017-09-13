package com.java_practice;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ReadingDataFromPdf {

	public static void main(String[] args) {
        try {
        	
			PdfReader reader = new PdfReader("C:/Users/E002466/Desktop/complete CSS.pdf");
			System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
			
			for (int i = 1; i <=reader.getNumberOfPages(); i++) {
				String page = PdfTextExtractor.getTextFromPage(reader, i);
				String[] str = page.split("\n");
				for (int j = 0; j < str.length; j++) {
					
						System.out.println(str[j]);
					
				}
			}
	        
	        System.out.println("Is this document tampered: "+reader.isTampered());
	        System.out.println("Is this document encrypted: "+reader.isEncrypted());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
}
