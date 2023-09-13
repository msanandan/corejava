package com.methods;

public class Method_Arg_Returnvalue {
	
	public static void main(String[] args) {
		
		
		int a= 10;
		
		int b= 20;
		
		
		long c=addNum(a,b);
		
		System.out.println("addition"+c);
		
		c = subNum(a,b);
		
		System.out.println("substration"+c);
		
		c = mulNum(a,b);
		
		System.out.println("multiplication"+c);
	}//main close
	
	public static long addNum(int x,int y)
	{
		long temp=x+y;
		return (temp);
	}

	public static long subNum(int x,int y)
	{
		long temp=x-y;
		return (temp);
	}
	public static long mulNum(int x,int y)
	
	{
		long temp =x*y;
		return temp;
	}
}
