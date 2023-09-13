package com.Arrys.msr;

//duplicate search

import java.util.Scanner;

public class Binary_18_program {

	public static void main(String[] args) {
		
		int[]nums = {10,18,15,10, 14,3,12,30, 80,10,36,45, 
				90,87,10,20, 40,75,10,100};
		
		     Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the number  you want to search");
		     
				int num = sc.nextInt();
				
				int counter=0;
				
				boolean searchFlage = false;
				
				for(int i=0; i<nums.length; i++)
				{
					if(num==nums[i]) 
					{
						counter++;
						searchFlage=true;
						System.out.println("your number found at nums["+i+"]");
					}
				
		}
				if( !searchFlage)
				{
					System.out.println("your number not found");
				}
				
				System.out.println("no of occurances"+counter);
	}
}
