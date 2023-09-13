package com.String;

public class String_Concatenation_program30 {
	
	public static void main(String[] args) {
		
		String str="";
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			
			str+=Integer.toString(0);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken to concatenate 100000 \n Strings using '+' operator:"
				+ (endTime - startTime)+" ms");
		
	}

}
