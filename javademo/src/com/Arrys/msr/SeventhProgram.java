//avarage of arry


package com.Arrys.msr;

public class SeventhProgram {
	
	public static void main(String[] args) {
		
		
		double array[] = {45,25,35,45,65};
		
		double sum = 0.0;
		
		double avg = 0.0;
		
		for(int i=0;i<array.length;i++){
		
		sum = sum + array[i];
	}
				
		
		avg = sum/array.length;
		System.out.println("Average: " + avg);
		
	}

}
