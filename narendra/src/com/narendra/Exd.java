package com.narendra;

public class Exd {
	
	     
		 public static void main(String args[]){ 
			   String  s="";
		   String str="i love my india";
		   String[]arrSplit=str.split(" ");
//		   for(int i=0;i<arrSplit.length;i++) {
//			   System.out.println(arrSplit[i]);
//		   }

		   for (int i = (str.length() - 1); i >= 0; i--) {
			    	s=s+(str.charAt(i));
			       
			    	
		   
	}
			 System.out.println(s);  		   
			   
}

}