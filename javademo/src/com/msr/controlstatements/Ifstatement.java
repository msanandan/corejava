//grater of two numbers

package com.msr.controlstatements;

import java.util.Scanner;

public class Ifstatement {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		
		
		int a =  sc.nextInt();
		
		System.out.println("Enter 2nd number");
		
		int b = sc.nextInt();
		
		if( a>b )
			 
		 {
			 System.out.println("grater number a ="+a);
		 }
		 else
			 
		 {
			 System.out.println("grater number b ="+b);
		 }
		 
	}

}
