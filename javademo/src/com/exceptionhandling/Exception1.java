package com.exceptionhandling;

public class Exception1 {
	
public static void main(String[] args) {
			try {
				System.out.println("Creating our our own Exception Object");
				
				throw new Exception("User Defined Exception");
				
			} catch (Exception ex) {
				
				System.out.println("Catch User Defined Exception");
				
				System.out.println(ex.getMessage());
			}

}
}

	
	