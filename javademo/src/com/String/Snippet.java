package com.String;

public class Snippet {
	private static final String input = null;


	public static void main(String[] args) {
		String input = "sample B text with G upper case LM chraters in between";
		
	}
	String regex ="[A-Z]";
	
	String SpecialChars = "";
	
	String inputData= "";

	
	for(int i=0;i<input.length();i++) {
		
		
		char ch =input.charAt(i);
		
		if (String .valueOf(ch).matches(regex)) {
			
			int specialChars = specialChars+ch;
			
		}else {
			
			inputData = inputData +ch;
		}
	}
  System.out.println("Result:" +inputData+specialChars);
	
  
	}
}

