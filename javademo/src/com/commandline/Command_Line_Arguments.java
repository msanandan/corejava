package com.commandline;

public class Command_Line_Arguments {
	
	class GFG{
		
		public static void main(String[] args) {
			
			
			if(args.length>0) {
				
				
				System.out.println("The commmand line" +"arguments are:");
				
				
				for(String val:args)
					
					System.out.println(val);
				
			}
			else
				System.out.println("No command line"+"arguments found");
		}
		
	}

}
