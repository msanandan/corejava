//copy array in java


package com.Arrys.msr;

public class Array_Java {
	
	public static void main(String[] args) {
		
		int src1[] = {1,2,3,4,5};
		
		int src2[] = {9, 18, 27,36,45};
		
		int neAarry[] = new int[src1.length + src2.length];
		
		int[] newArray;
		for(int i=0; i<src1.length;i++) {
			
			newArray[i] = src1[i];
		
	      }
		for(int i=0, j=src1.length;j<(src1.length + src2.length); 
				                                      j++,i++){
		    newArray[j] = src2[i];
		    
		    System.out.println("Array1=" +Arrays.toString(src1));
		    System.out.println("Array2=" +Arrays.toString(src2));
		    System.out.println("Merged Array=" +Arrays.toString(newArray));
		
	           }
	      
				
	}	
}


