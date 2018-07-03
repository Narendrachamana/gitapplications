package com.Test;

public class Demo7b extends Demo7{

	int x=10;
	
	
	void print() {
		
		int x=20;
		System.out.println(x);  //20
		System.out.println(this.x); //10
		System.out.println(super.x); //5
				
	}
	
	void show(String s){
		System.out.println("This is Sub class method");	
		
		
	}
	
	
	
	
	
	public static void main(String args[]) {
			
		Demo7b obj1=new Demo7b();
		
		obj1.show(5);
		obj1.show("s");
	}
}





