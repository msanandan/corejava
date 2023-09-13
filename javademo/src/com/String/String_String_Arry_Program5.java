//java program to convert String to String Array
package com.String;

public class String_String_Arry_Program5 {
	
	
	public static void main(String[] args) {
	
		
		
		String str = "wonder full day";
		
		String strArray[] = str.split(" ");
		
		System.out.println("String : "+ str);
		
		System.out.println("String arry:[");
		
		for (int i=0;i<strArray.length;i++) {
			
			System.out.print(strArray[i] + " ,");
		}
		System.out.print("]");
			
			
			
			
		}
	}
	
	
	
	


