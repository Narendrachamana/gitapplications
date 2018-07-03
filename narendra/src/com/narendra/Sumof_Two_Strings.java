package com.narendra;

public class Sumof_Two_Strings {
	 static final String S="0123456789";

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String str="ab1odk";
	String st1="cgd20kij";
	int sum=str+str1;
	System.out.println(sum);
		}
	public static int sum(String str){
		int i=0,sum=0;
		String temp="0";
		while(i<str.length())
		{
			char s=str.charAt(i);
			if(S.contains(Character.toString(s))){
				temp+=str.charAt(i);
			}else{
				sum+=Integer.valueOf(temp);
				temp="0";
			}
			i++;
		}
		sum+=Integer.valueOf(temp);

		return sum;
	}
	
}
