package com.Arrys.msr;

public class Transpose_Matrix {
	
	public static void main(String[] args) {
		
	}
		public static int[][]transposeMatrix(int[][]a){
		int row = a.length;
		int column = a[0].length;
		
		int temp[][] = new int[row][column];
		
		for(int i=0;i<row;i++) {
		
			
		for(int j=0;j<column;j++) {
			
			temp[i][j] = a[j][i];
		}
		}
		return temp;
				
	}
	}



