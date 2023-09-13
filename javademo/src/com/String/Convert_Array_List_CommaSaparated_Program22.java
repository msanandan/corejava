package com.String;

import java.util.ArrayList;

public class Convert_Array_List_CommaSaparated_Program22 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> Familylist=new ArrayList<String>();
		
		
		Familylist.add("Sanandan");
		
		Familylist.add("good");
		
		Familylist.add("and");
		
		Familylist.add("Small");
		
		Familylist.add("family");
		
		Familylist.add("!");
		
		StringBuilder str= new StringBuilder("");
		
		for(String eachstring : Familylist) {
			
			
			str.append(eachstring).append(",");
			
			String commaseparatedlist = str.toString();
			
			if(commaseparatedlist.length() > 0)
				
				commaseparatedlist=commaseparatedlist.substring
				
				(0,commaseparatedlist.length() -1);
				
				System.out.println(commaseparatedlist);
			
			
		}
	}

}
