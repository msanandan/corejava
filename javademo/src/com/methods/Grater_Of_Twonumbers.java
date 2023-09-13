package com.methods;

public class Grater_Of_Twonumbers {
	
	public static void main(String[] args) {
		
		
		int a;
		
		int b;
		
		System.out.println("Main start");
		
		a = 30;
		
		b = 20;
		
		greater(a,b);
		
		System.out.println("after grater one");
		
		a=20;
		
		b=30;
		
		greater(a,b);
		
		System.out.println("after grater two");
		
		System.out.println("main end");
	}
	public static void greater(int x,int y)
	{
		System.out.println("greater start");
		
		if(x>y)
		{
			return;
		}
		System.out.println("greater end");	
		
	}

}
