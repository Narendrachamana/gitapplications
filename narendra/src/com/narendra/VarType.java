package com.narendra;

public class VarType {
	int x=10;// instance variable
	static int y=20;// class variable
	public static void main(String args[]) {
		int z=30;  // local variable
		VarType obj=new VarType();
		System.out.println(obj.x);
		System.out.println(VarType.y);
		System.out.println(z);
		
		
	}

}
