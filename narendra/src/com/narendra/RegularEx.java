package com.narendra;

import java.util.regex.Pattern;

public class RegularEx {
	
	public static void main(String args[]){
		
//		char g='hk';
	System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "arun32" ));//true (2nd char is s)
	//System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
	//System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
	//System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
	//System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)
	}

	}


