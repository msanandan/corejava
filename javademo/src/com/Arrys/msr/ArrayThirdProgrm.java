package com.Arrys.msr;

public class ArrayThirdProgrm {
public static void main(String[] args) {
	
	int[] a = readArray();
	
     for (int i=0;i<a.length;i++) {
    	 System.out.println(a[i]+"\t");
     }
}
    public static int[] readArray(){
    	
    	int[] arr= {50,60,70,80};
    	
    	return arr;
    }
}
