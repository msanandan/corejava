package com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Unique_Words_Progrm16 {
	
	public static void main(String[] args) {
		
		
		String str = "Guiter is instument and piano is instrument";
		
		String[] strArry =str.split("\s+");
		
		Map<String,String> hMap = new LinkedHashMap<String, String>();
		
		for(int i=0;  i < strArry.length;i++) {
			
			if (!hMap.containsKey(strArry[i])) {
				
				hMap.put(strArry[i],"Unique");
			}
		}
		System.out.println(hMap);
	}

}
