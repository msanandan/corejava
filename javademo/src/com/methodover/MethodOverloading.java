package com.methodover;

public class MethodOverloading {

	static int addition(int a,int b)
	{
		return a+b;
	}
	static int addition(int a,int b, int c)
	
	{
	return a+b+c;	
	}
	
	static double addition(double a,double b, int c)
	
	{
		return a+b+c;
	}
	
public static void main(String[] args) {
	
	
	System.out.println(addition(12,13,14));
	
	System.out.println(addition (12.2,13.3,14));
	
	System.out.println(addition(20,40));
	
	
}	
	
}

