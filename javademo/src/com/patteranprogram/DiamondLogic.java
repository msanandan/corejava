package com.patteranprogram;

public class DiamondLogic {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
			
		{
			System.out.println();
			
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			
		}
		for(int i=4; i>=1;i--)
		{
			System.out.println();     
			
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
				
			{
				System.out.print(j+" ");
			}
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j+" ");
			}
				
		}
	}

}

