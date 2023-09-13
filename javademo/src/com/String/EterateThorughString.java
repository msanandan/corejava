
//iterate through string
//iterate through string
package com.String;

public class EterateThorughString {
	
	public static void main(String[] args) {
		String name = "baviarvi";
		
		System.out.println("Charateters in "+ name + "are:");
		
		for(int i=0;i<name.length();i++) {
			
			char a = name.charAt(i);
			System.out.println(a +", ");
		}
	}

}
