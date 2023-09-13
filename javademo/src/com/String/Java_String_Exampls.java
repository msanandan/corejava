package com.String;

public class Java_String_Exampls {
	
	public static void main(String[] args) {
		
		
		String s1="hello";
		
		System.out.println("S1");
		
		String s2=new String("hello");
		
		System.out.println(s2);
		
		String s3 = new String(s1);
		
		System.out.println(s3);
		
		String s4=s1;
		
		System.out.println(s4);
		
		byte[] b= {65,66,57,43,44,33,23};
		
		String s5 = new String(b);
		
		System.out.println(s5);
		
		char []ch = {'h','e','l','l','o'};
		
		String s6 = new String(ch);
		
		System.out.println(s6);
		

		
		
	}
	

}
