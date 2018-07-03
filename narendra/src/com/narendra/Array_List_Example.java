package com.narendra;
import java.util.ArrayList;
import java.util.List;

public class Array_List_Example {

	public static void main(String[] args) {
		List<String> a=new ArrayList<> ();
		a.add("narendra");
		a.add("is");
		a.add("good boy");
		for(int i=0;i<a.size();i++)
		System.out.print(a.get(i)+" ");

	}

}
