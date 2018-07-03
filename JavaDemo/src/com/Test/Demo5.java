package com.Test;

public class Demo5 {
	
	
	static void emp(String empId) {
		
	
		
		System.out.println("employee Id is "+empId);
		
	}
	
	  
	void show(String name, int age) {
		 
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		Demo5.emp("emp1001");	
		
	}
	
	public static void main(String args[]) {
		
		new Demo5().show("Sagar", 25);
		
		
		
//		Demo5 obj1=new Demo5();
//		obj1.show(10);
		
		
	}
	
	
	

}
