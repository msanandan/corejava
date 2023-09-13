package com.String;

import java.util.ArrayList;

public class Split_String_Into_Number_Substring_Progrm35 {
	
	public static void main(String[] args) {
		
		public static ArrayaList<String>
		
		splilSubstrings(String s)
		
		{
			
			int i,j;
			
			int stringLength = s.length();
			
			ArrayList<String>subStringList = new ArrayList<string>();
			
			for(i=0;i<stringLength;i++) {
				
		   for(j=i+1;j<=stringLength;j++) {
			   
			   subStringList.add(s.substring(i,j));
			   
			   
		   }
			}
			return subStringList;
			
			String stringInput = new String("The Sanandan");
			
			
			ArrayList<String> subStringsList=SubstringofAString.splitSubstring(stringInput);
			
			System.out.println("\nSubstring list printed as an Arrylist:");
			
			System.out.println("\n\nall substring printed 1perline: ");
			
			int count =1;
			
			for(String it:subStringList) {
				
				System.out.println("("+count+")\"" + it+"\"");
				
				count++;
				
			}
		}
	}


