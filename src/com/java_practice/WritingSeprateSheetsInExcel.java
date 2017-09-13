package com.java_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WritingSeprateSheetsInExcel {

	String[][] st;
	int rownum;
	Row r;
	int colNum;
	public static void main(String[] args) {
		WritingSeprateSheetsInExcel ab = new WritingSeprateSheetsInExcel();
		ab.readingAndWriting();

	}

	public void readingAndWriting(){
		try{
			FileInputStream fis= new FileInputStream(new File("C:\\Users\\E002466\\Desktop\\data2.xls"));		
			Workbook wb =new  HSSFWorkbook(fis);

			Sheet sheet = wb.getSheetAt(0);	

			// worksheet1=workbook1.getSheet(workbook1.getSheetName(0));
			 rownum= sheet.getLastRowNum();

			for (int i = 0; i <=rownum; i++) {
				 r = sheet.getRow(i);
				 colNum = r.getLastCellNum();
				 if(st==null){
				st= new String[rownum+2][colNum];
				 }
				System.out.println(st.length);
				for (int j = 0; j <colNum ; j++) {
					Cell c = r.getCell(j);
					st[i][j] = c.getStringCellValue();
					System.out.println( "the value in row "+ i +"and the value in col "+j + st[i][j]);
				}
				
			}
			
			for (int i = 0; i <=rownum; i++) {
				
				for (int j = 0; j <colNum ; j++) {
					System.out.println(st[i][j]);
				}
				
			}
			
			
				fis.close(); 


				Workbook wb1 = new HSSFWorkbook();
				Sheet sh1 = wb1.createSheet("indraja");

				System.out.println(rownum);
				System.out.println(colNum);
				for (int a = 0; a <=rownum+1; a++) {

					Row row = sh1.createRow(a);

					for (int j = 0; j <colNum ; j++) {
						Cell cell = row.createCell(j);

						if(a==rownum+1){
						cell.setCellValue("abcd"+((int)((Math.random())*1000))+"");
						}else{
							cell.setCellValue(st[a][j]);
							System.out.println("the value of a: "+(a)+"the value of jP:  "+(j) +"is "+st[a][j]);
						
				
					}

				}
				
				FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\E002466\\Desktop\\data.xls"));
				wb1.write(fos);
				fos.close();
				}
			
		}catch(Exception e){
			System.out.println(e);
		}



	}
}
