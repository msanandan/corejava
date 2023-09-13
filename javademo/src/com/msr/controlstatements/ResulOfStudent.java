//resut student 3 subject marks pass or fail //nested if

package com.msr.controlstatements;

import java.util.Scanner;

public class ResulOfStudent {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sub1 marks");
		
		int m1 = sc.nextInt();
		
		System.out.println("Enter sub2 marks");
		
		int m2 = sc.nextInt();
		
		System.out.println("Enter sub3 marks");
		
		int m3 = sc.nextInt();
		
		
		if(m1>=40)
			
		{
			if(m2>=40)
			{
				if(m3>=40)
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("Fail");
				}
			}
			else
			{
				System.out.println("fail");
			}
		}
		}
	}


