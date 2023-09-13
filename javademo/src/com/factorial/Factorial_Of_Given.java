package com.factorial;

import com.msr.abc.Factorial_Given_Number;

public class Factorial_Of_Given {

	
	private static Object fact;

	public static void main(String args[]) {
	int i,fact=1;	
   int number=5;
   for(i = 1;i<=number;i++)
   {
	   fact=fact*i;

   }
   System.out.println("factorial of" +number+ "is:"+fact);
	}
}
