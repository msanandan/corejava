package com.String;

import java.util.Scanner;

public class Validate_Userid_Password_program13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter user id");
		
		String userId = ("Enter passwd:");
		
		String pwd = sc.next();
		
		if(userId.equalsIgnoreCase("sanandan@gmail.com")&&
				
				pwd.equals("java12345")) {
			
			System.out.println("valid user");
		}else {
			
			System.out.println("invalid user");
		}
	}

}
