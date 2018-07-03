package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UseData {

	public static String getDateAsNumber() {
		
		String dt=new SimpleDateFormat("YYYYMMddHmmss").format(new Date());
//		System.out.println(dt);
		return dt;
		
		}
	
	public static void main(String args[]) {
		getDateAsNumber();
	}
	
	
}
