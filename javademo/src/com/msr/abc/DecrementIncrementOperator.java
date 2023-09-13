package com.msr.abc;

public class DecrementIncrementOperator {
	
	public static void main(String[] args) {
		
		
		
		int a=5, b, c, d;
		
		b = a++;
		
		c = --b;
		
		d = c++;
		
		a = --b;
		
		c = d++;
		
		b = --a;
		
		d = c++;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
	}

}
