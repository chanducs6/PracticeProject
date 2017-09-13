package com.java_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class FlipkartDataAddingInPdf {

	public static String[][] rows = new String[60][2];
	static String[] headers = new String[]{"SAMSUNG MOBILE PRODUCT NAME ", "MAXIMUM RETAIL PRICE "};

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E002466\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com");
		Thread.sleep(6000);
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Samsung'])[1]")).click();
		Thread.sleep(3000);
		By productsName = By.xpath("//div[@class='col zZCdz4']//div[contains(@class,'_3wU')]");
		By productsPrice = By.xpath("//div[@class='col zZCdz4']//div[contains(@class,'vC4OE _2rQ-NK')]");
		List<WebElement> Productsname = driver.findElements(productsName);
		List<WebElement> ProductPrice = driver.findElements(productsPrice);

		try {

			FileOutputStream fos = new FileOutputStream(new File("flipkartData.xls"));
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sh = wb.createSheet("flipcart details");
			for (int i = 0; i <Productsname.size(); i++) {
				Row r = sh.createRow(i);
				for (int j = 0; j < 2; j++) {
					Cell c = r.createCell(j);
					if(j==0){
						c.setCellValue(Productsname.get(i).getText());
					}else{
						c.setCellValue(ProductPrice.get(i).getText());

					}
				}

			}

			wb.write(fos);
			fos.close();

			for (int i = 0; i < Productsname.size(); i++) {


				for (int j = 0; j < 2; j++) {

					if(j==0 ){
						rows[i][j] = Productsname.get(i).getText();
					}else{
						rows[i][j] = ProductPrice.get(i).getText();
					}
				}

			};  	       

			// Create a new document.
			Document document = new Document(PageSize.LETTER.rotate());

			try {
				// Get an instance of PdfWriter and create a Table.pdf file
				// as an output.
				PdfWriter.getInstance(document,
						new FileOutputStream(new File("TableDemo.pdf")));
				document.open();

				Font fontHeader = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLDITALIC);
				Font fontRow = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.ITALIC);

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
				
				  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		           //taking screenshot and adding to the pdf file 
				 
		              FileUtils.copyFile(scrFile, new File("C:/Users/E002466/Desktop/abcd.jpeg"));
		              Image img = Image.getInstance("C:/Users/E002466/Desktop/abcd.jpeg");

		             
				document.add(table);
				document.add(img); 
			} catch (DocumentException | FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				document.close();
			} 

		}catch(Exception e){
			System.out.println(e);
		}


	}
}
