package com.Arrys.msr;

public class RowSum_Column_Sum {
	private static int j;
	private static int i;
	private static String sum;
	private static String row;
	public static void main(String[] args) {
		
		int rows,colos,sumRow = 0,sumcol;
		
		int a[][] = {
				
				{1,2,3},
				
				{4,5,6},
				
				{7,8,9}
		};
		
		rows = a.length;
		  int cols = a[0].length;
		
		
		for(int intj = 0;j<cols;i++) {
			
			sumRow = sumRow +a[i][j];
			
		
             System.out.println("sum of"+(i+1)+"row:"+sumRow);

   for(int i=0;i<cols;i++) {

            sumcol =0;
            
            for(int j=0;j<rows; j++) {
            	
            	sumcol = sumcol + a[j][i];
            }
            System.out.println("Sum of"+(i+1)+"column:" +sumcol);
   }
	}        
	}
}