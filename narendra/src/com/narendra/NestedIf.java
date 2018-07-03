package com.narendra;

public class NestedIf {
	public static void main(String args[]) {
		int x=20;
		int y=30;
		int z=30;
		if(x>y)
		{
			System.out.println("x is grater");
			
		}
		else
			if(y>z)
			{
				System.out.println("y is grater");
				
			}
			else {
				System.out.println("z is grater");
			
			}
		
	}

}
