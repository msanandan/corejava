package com.String;

public class Even_Length_Words_progrm65 {

	public static void main(String[] args) {
		
		
		String input_string = "java Progrmming are cool";
		
		System.out.println("The string is defind as:"+input_string);
		
		
		System.out.println("\n the words with even length are:");
		
		for(String word : input_string.split(" "))
			
			if(word.length()%2 ==0)
				
				System.out.println(word);
	}
}
