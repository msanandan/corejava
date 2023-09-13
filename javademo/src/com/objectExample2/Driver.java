package com.objectExample2;

public class Driver {
    public static void main(String[] args) {
    	
    	Driver d = new Driver();
    	
    	Person per = d.m1(200);
    	
    	System.out.println(per.id+"---"+per.name+"---"+per.age);
	
}
    
    Person m1(int id) {
    	
    	Person p = new Person();
    	if(id==101) {
    		
    		p.name="sanandan";
    		
    		p.age = 30;
    		
    	}else if(id == 102) {
    		
    		p.id = 102;
    		
    		p.name = "raju";
    		
    		p.age = 32;
    	}
    	return p;
    }
}
