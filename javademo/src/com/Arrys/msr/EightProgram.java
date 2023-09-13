//min,max,sum and avg of given elements in array
package com.Arrys.msr;

public class EightProgram {
	
	public static void main(String[] args) {
		
		int[]a= {10,18,15,25,14,3,12};
		
		int max=a[0];
		  
		int min=a[0];
		
		
		for(int i=1; i<a.length; i++)
		{	
		if(a[i]>max)
		
		{
		max=a[i];	
		}
		
		if(a[i]<min)
		{
			
		min=a[i];
		
		}
	}
		int sum=0;
		for(int i=0; i<a.length;i++) {
			
			sum = sum+a[i];
		}
		float avg = (float)sum/a.length;
		
		System.out.println("count of numbers"+a.length);
		
		System.out.println("max = "+max);
		
		System.out.println("min= " +min);
		
		System.out.println("sum=  "+sum);
		
		System.out.println("avg= "+avg);
	}
}



