package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("E:\\selenium document\\hello.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
       	Row r=sheet.createRow(3);
       	Cell c=r.createCell(3);
       	c.setCellValue("heloo");
		FileOutputStream file1=new FileOutputStream("E:\\selenium document\\hello.xlsx");
        workBook.write(file1);
		
	}

}
