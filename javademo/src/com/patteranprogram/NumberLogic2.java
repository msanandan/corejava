package com.patteranprogram;

public class NumberLogic2 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			System.out.println();
			
			for(int j =5; j<i; j--)
				
			{
			System.out.print(" ");
			
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		}
	}
	

}
