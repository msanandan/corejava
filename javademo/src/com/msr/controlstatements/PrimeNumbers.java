package com.msr.controlstatements;

import java.util.Scanner;


public class PrimeNumbers {
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int n = sc.nextInt();
		
		for(int i=2; i<n; i++)
			
			if(n % i == 0)
			{
				System.out.println("it is not prime number");
				
				System.exit(0);
				break;
			}
		System.out.println("it is a prime number");	
	}
  
}
