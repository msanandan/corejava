
package com.methodover;

public class MethodOverloading2 {
	
	public static void  m1(String str)
	
	{
		System.out.println("String");
	}
     public static void m1(Object obj)
     
     {
    	 System.out.println("Object");
     }
     
     public static void main(String[] args) {
		 m1(null);
	}

}
