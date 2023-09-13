package com.String;

import java.text.FieldPosition;
import java.util.Scanner;

public class Enumnumber_Program2 {
	
	enum Position{
		
		First,Second,Third;
	}
   enum prize{
	   
	   Gold,Silver,Bronez;
   }

private static Object pos;
private static Object str;
private static int i;
   
   public static void main(String[] args) {

	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Enter Your position:"); 
	   
	   String str= scanner.next();
	   
	  for(Position pos:Position.values()) {
		  
		  
		  int i=pos.ordinal();
		  
		  String str1 = pos.toString();
		  
		  if(str.equals(str1)) {
	   


		   
		   for(prize prize:prize.values()) {
			   
			   int j=prize.ordinal();
			   
			   if(i==j) {
				   
				   System.out.println("congratulation you are won a"+prize+"medal.");
			   }
		   }
	   }
      
   }
   }
}

