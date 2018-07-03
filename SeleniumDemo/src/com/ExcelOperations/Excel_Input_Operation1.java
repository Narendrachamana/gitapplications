package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Input_Operation1 {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\selenium document\\hello.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		Row r=sheet.getRow(0);
		Cell c=r.getCell(1);
		String data=c.getStringCellValue();
		System.out.println(data);
	}



		
	}


