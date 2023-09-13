package com.msr.abc;

public class IncrementOPerator {
	
	public static void main(String[] args) {
		
		
		int a=5, b, c, d;
		
		d = a++; // d=5, a=6  
		
		c = ++d; // d=6,c=6
		
		b = c++; // b=6, c=7
		
		
		a = ++d; //d=7, a=7
		
		b = c++; //c=7,b=7
		
		c = ++a; //a=8, c=8
		
		
		d = b++; //d=7, b=8
		
		System.out.println(a);
		
		System.out.println(b);
		
	    System.out.println(c);
	
	    System.out.println(d);
		
	}

}
