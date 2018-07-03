package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation2_completeData {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\selenium document\\hello.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);		
		for(int i=0;i<=rowcount;i++) {
		Row r=sheet.getRow(i);
		int cellcount=r.getLastCellNum();
		System.out.println(cellcount);
		for(int j=0;j<cellcount;j++) {
		Cell c=r.getCell(j);
		String data=c.getStringCellValue();
		System.out.print(data+" ");
		}
		System.out.println();
		}
	}

}
