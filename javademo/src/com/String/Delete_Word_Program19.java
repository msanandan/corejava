package com.String;

import java.util.Scanner;
public class Delete_Word_Program19 {

	
	private static Object sentence;
	private static Object word;

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		sentence = scanner.nextLine();
		
		System.out.println("Ente word you want to delete from sentence");
		
		word = scanner.nextLine();
		
		sentence = sentence.rwplaceAll(word,"");
		
		System.out.println("outout Sentence\n"+sentence);
				
				
		
		 
	}
}
