package com.Arrys.msr;

public class Even_Numbers_Odd_Sum {
	
	public static void main(String[] args) {
		int arr[]= {12,43,57,66,69,84};
		
		int oddSum=0,evenSum=0;
		
		for(int i=0;i<6;i++) 
		{
			if(arr[i]%2==0) 
			{
				evenSum=evenSum+arr[i];
			}
		}
		System.out.println("\nsum of even is"+evenSum);
		System.out.println("\nsum of odd is"+oddSum);
	}

}
