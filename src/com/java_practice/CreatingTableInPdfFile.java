package com.java_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatingTableInPdfFile {
	 public static void main(String[] args) {
		 try {
	        String[] headers = new String[]{"S No", "SAMSUNG MOBILE PRODUCT NAME ", "MAXIMUM RETAIL PRICE "};
	        
	        String[][] rows = new String[][]{
	                {"1","mobile", "jdow"},
	                {"2","mobile", "stiger"},
	                {"3","mobile", "fbar"}
	        };

	        // Create a new document.
	        Document document = new Document(PageSize.LETTER.rotate());

	       
	            // Get an instance of PdfWriter and create a Table.pdf file
	            // as an output.
	            PdfWriter.getInstance(document,
	                    new FileOutputStream(new File("TableDemo.pdf")));
	            document.open();

	            Font fontHeader = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
	            Font fontRow = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);

	            PdfPTable table = new PdfPTable(headers.length);
	            
	            for (String header : headers) {
	                PdfPCell cell = new PdfPCell();
	                cell.setGrayFill(0.9f);
	                cell.setPhrase(new Phrase(header.toUpperCase(), fontHeader));
	                table.addCell(cell);
	            }
	            table.completeRow();

	            for (String[] row : rows) {
	                for (String data : row) {
	                    Phrase phrase = new Phrase(data, fontRow);
	                    table.addCell(new PdfPCell(phrase));
	                }
	                table.completeRow();
	            }

	            document.addTitle("PDF Table Demo");
	            document.add(table);
	            document.close();
	        } catch (DocumentException | FileNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	           
	        }
	    }
}
