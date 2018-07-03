package com.narendra;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Array_MultiDimentional {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		String a[][]=new String[3][3];
		a[0][0]="rani";
		a[0][1]="ravi";
		a[0][2]="raju";
		
		a[1][0]="nani";
		a[1][1]="nag";
		a[1][2]="nanu";
		
		a[2][0]="hello";
		a[2][1]="hii";
		a[2][2]="hai";
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}
