package com.java_practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadingFromExcel {

	public static void main(String[] args) {

		try{
			
			FileInputStream fis= new FileInputStream(new File("C:\\Users\\E002466\\Desktop\\data2.xls"));

			Workbook  workbook1=new HSSFWorkbook(fis);

			Sheet sheet=workbook1.getSheet("Test Cases");	
			
			int rowNum = sheet.getLastRowNum();
			
			for (int i = 0; i <= rowNum; i++) 
			{
				
				Row r = sheet.getRow(i);
				int colNum = r.getLastCellNum();
				for(int j=0; j<colNum ; j++)
				{
					
					Cell c = r.getCell(j);
					if(c.getCellType()==Cell.CELL_TYPE_NUMERIC){
						System.out.println("the numeric cell value is : "+c.getNumericCellValue());
						
					}else if(c.getCellType()==Cell.CELL_TYPE_STRING){
						
						System.out.println("the string cell value is : "+c.getStringCellValue());
					
					}else {
						System.out.println("the value is not integer and not string  : "+c.getDateCellValue());
					}
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
/*
			// worksheet1=workbook1.getSheet(workbook1.getSheetName(0));
			int rownum= sheet.getLastRowNum();

			System.out.println("No of rows in excel: "+ (rownum+1));
			for(int i=0; i<= rownum; i++)
			{
				Row r= sheet.getRow(i);
				if(r!=null)
				{
					int colnum= r.getLastCellNum();
					for(int j=0; j<colnum; j++)
					{
						Cell c= r.getCell(j);
						if((c!=null))
						{
							if(c.getCellType() == Cell.CELL_TYPE_NUMERIC)
							{

								if(!(c.getCellFormula().equals("")))
								{
									System.out.println("&&&&&&&&&&&&&&&&& Formula is :"+ c.getCellFormula());

								}
								System.out.println("Data present in "+ i+"row and "+j+"column is: "+ c.getNumericCellValue()+ "With Style: "+ c.getCellStyle().getDataFormatString());
							}

							else if(!(c.getStringCellValue().equals("")))
							{
								if(c.getCellComment()!=null)
								{
									System.out.println("########### Comment is : "+ c.getCellComment().getString());
									System.out.println("Data present in "+ i+"row and "+j+"column is: "+ c.getStringCellValue() + "With Style: "+ c.getCellStyle().getDataFormatString());
								}
								else
								{
									System.out.println("Data present in "+ i+"row and "+j+"column is: "+ c.getStringCellValue() + "With Style: "+ c.getCellStyle().getDataFormatString());

								}

							}

						}


					}

					System.out.println("******************************** Last Column of row "+ (i)+ "is :" + colnum);
				}    

			}
*/

			/*Row header= sheet.getRow(0);
	               Row data = worksheet1.getRow(1);
	               int colnum= header.getLastCellNum();
	               int rownum=sheet.getLastRowNum();2
	               System.out.println("Total no. of Rows in excel:"+ rownum);
	               System.out.println("Total No. of Columns in excel: "+ colnum);

	               for(int i=0; i<row2; i++)
	               {
	                   Row r = sheet.getRow(i);

	                     for(int j=0; j<colnum; j++)
	                     {
	                    	 Cell  c = r.getCell(j);

	                    	 if()
	                    	 System.out.println(c.getStringCellValue());


	                     }

	               }*/

			fis.close();

			//fis.close();      

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}   

}

