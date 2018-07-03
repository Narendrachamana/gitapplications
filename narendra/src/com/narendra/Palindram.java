package com.narendra;

import java.util.Scanner;

public class Palindram {
//	public static void main(String args[]){  
//		  int r,sum=0,temp;    
//		  int n=454;//It is the number variable to be checked for palindrome  
//		  
//		  temp=n;    
//		  while(n>0){    
//		   r=n%10;  //getting remainder  
//		   sum=(sum*10)+r;    
//		   n=n/10;    
//		  }    
//		  if(temp==sum)    
//		   System.out.println("palindrome number ");    
//		  else    
//		   System.out.println("not palindrome");    
//		}  
//		}  
	 public static void main(String args[])  
	   {  
	      String reverse="",original;
	      Scanner sc=new Scanner(System.in);
	     
	      System.out.println("enter a string/number:  ");
	      original=sc.nextLine();
	      
	      int length=original.length();
	      for(int i=length-1;i>=0;i--) 
	    	  reverse=reverse+original.charAt(i);
	      if(original.equals(reverse)) {
	    	  System.out.println(original+"---given string / number is palindram");
	      }
	      else
	      {
	    	  System.out.println(original+"---not a palindram");
	      }
	   
	   
	   }
	 }
	      
	    		 
	 
