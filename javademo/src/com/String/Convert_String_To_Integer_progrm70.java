package com.String;

import java.util.Arrays;

public class Convert_String_To_Integer_progrm70 {
	
	public static void main(String[] args) {
		
		
		String str = "[1,2,356,678,3378]";
		
		String[] string = str.replaceAll("\\[", "")
				             .replaceAll("]","")
				             .split(",");
		
		
		int[]arr = new int[string.length];
		
		for(int i=0;i<string.length;i++) {
			
			arr[i] = Integer.valueOf(string[i]);
		} 
		System.out.println("String :"+str);
		
		
		System.out.println("\n Integer array : "+Arrays.toString(arr));
	}

}
