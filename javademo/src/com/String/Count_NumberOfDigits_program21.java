package com.String;

public class Count_NumberOfDigits_program21 {
	
	public static void main(String[] args) {
		
		
		String str = "Sanandan Redddy password is: 12345";
		
		int digits = 0;
		
		for(int i=0; i<str.length();i++) {
			
			if (str.charAt(i)>=48&&str.charAt(i)<57) digits++;
			
		
		}
		System.out.println("Total number of Digits="+digits);
	}

}
