package com.objectExample3;

public class Driver {
	
	public static <Player> void main(String[] args) {
		
		
			Driver d = new Driver();

           Player p = d.m1(32);
           
           System.out.println(p.id+"---"+p.name+"---"+p.age);
           
	}
	     player m1(int id) {
		
		player p = new player();
		
		if(id == 7)
			p.id = 7;
		
		    p.name = "dhoni";
	}
}