package com.methodover;

public class Method_Overloading {
	
	
	public void m1(int i)
	{
		System.out.println(i);
	}
	public void m1 (double i)
	{
		System.out.println(i);
	}
	 void m1(float i)
	{
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		Method_Overloading obj= new Method_Overloading();
		
		obj.m1(10.6);
	}

}
