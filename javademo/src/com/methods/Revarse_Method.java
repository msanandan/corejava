package com.methods;

public class Revarse_Method {

	public static void main(String[] args) {
		
	   Methods m1=new Methods();
		
		String str = "sanandan";
		
		String reverseString = m1.reverseString(str);
		
		System.out.println(reverseString);
	}
	
	private String reversestring(String s1) {
		
		String result = "";
				
				for(int i=s1.length()-1;i>=0;i--) {
					
					result=result+s1.charAt(i);
				}
		return result;
	}
	}
