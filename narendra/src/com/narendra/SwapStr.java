package com.narendra;

public class SwapStr {
	public static void main(String[] args) {
	 String a = "one";
		String b = "two";
			System.out.println("a vale  "   +  a);
			System.out.println("b value  " +  b);
//			String temp = null;
//			temp = a;
//			a = b;
//			b = temp;
//			System.out.println("after a value  "+   a);
//			System.out.println("after b value  "+  b);
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println("after a value  "+   a);
		System.out.println("after b value  "+  b);
		

}
}