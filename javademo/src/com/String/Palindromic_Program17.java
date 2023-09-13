package com.String;

import java.util.Scanner;

public class Palindromic_Program17 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n =sc.nextInt();
		
		int temp = n;
		
		int rev = 0;
		
		while( n>0 )
		{
			int r = n%10;
			
			rev = rev*10+r;
			
			n = n/10;
			
		}
		System.out.println("reverse= "+rev);
		
		System.out.println("n = "+n);
		
		if(rev == temp)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	
	

}
