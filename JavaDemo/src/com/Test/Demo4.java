package com.Test;

public class Demo4 {
	
	
	
	
	 int x=10; //Instance variables
	
	String name="Sagar";
	
	static int y =20; //Class variable
	static String gender="Male";
	
 void sum() {
		int x=20;
		System.out.println(this.x);
		System.out.println(x);
	
 }
 static void substract() {
		int a=25;
		int b=40;
		int sub=b-a;
		
		System.out.println("substraction is "+sub);		
	}
	
 public static void main(String args[]) {
	
		Demo4 obj1=new Demo4();
		obj1.sum();
		
		substract();
			
	}
	
	
	

}

class XYZ {
	
	void show() {
		
		Demo4.substract();
		
	}
		
}