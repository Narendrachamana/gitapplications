package com.Test;

public class Demo6 {
	
	
	int add(int first, int second){
		
		int sum;
		sum=first+second;	
		
		return sum;
	}
	
	static int sub(int first, int second ) {
		
		return second-first;
	
	}
	
	String show() {

		int sum=this.add(20, 50);
		int sub=sub(10,20);
		
		int multi=sum*sub;
		
		System.out.println("Actual value is "+multi);
		
		return "UnCompleted";
	}
	
	
	
	public static void main(String args[]) {
		
		Demo6 obj=new Demo6();
		
		String status=obj.show();
		
		System.out.println("Status is "+status);
		
		
		
		
	}
	
	
	

}
