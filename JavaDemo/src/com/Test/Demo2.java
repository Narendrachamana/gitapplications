package com.Test;

public class Demo2 {
	
	String a="sagar";
	int b=10;
	
	void show() {
		int a=15;
		System.out.println(new Demo2().a);
		System.out.println(a);
		System.out.println(b);
	}

	

	public static void main(String[] args) {
		
		Demo2 objDemo2= new Demo2();
//		new Demo2().show();
		objDemo2.show();
		
			
	}

}
