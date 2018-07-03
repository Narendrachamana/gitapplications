package com.exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwriteoperation {

	public static void main(String[] args) throws IOException 
	{
     FileInputStream fis =new FileInputStream("D:\\Java-Eclipse\\balaji\\src\\com\\exceloperations\\balaji.xlsx");
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sheet =wb.getSheet("Sheet1");
     Row r=sheet.createRow(0);
     Cell c =r.createCell(3);
     c.setCellValue("hi");
     FileOutputStream fis2=new FileOutputStream("D:\\Java-Eclipse\\balaji\\src\\com\\exceloperations\\balaji.xlsx");
     wb.write(fis2);
     
    		 
	}
}


