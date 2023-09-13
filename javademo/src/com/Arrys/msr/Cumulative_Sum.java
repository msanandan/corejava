package com.Arrys.msr;

public class Cumulative_Sum {
	
	public class Main{
	public static void main(String[] args) {
	
		int sum=0;
		
		int numbers[] = {44,5,9,15,31,22,19,48};
		
		for(int i=0;i<numbers.length;i++)
		{
			sum+= numbers[i];
			
			numbers[i] = sum;
		}
				
		System.out.println("cumulative sum is");
		
		//System.out.println(Arrays.toString(numbers));
	}

}
}

