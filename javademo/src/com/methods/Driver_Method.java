package com.methods;

public class Driver_Method {

	
	public static void main(String[] args) {
		
		
		Driver d =new Driver();
		
		Employee e = new Employee();
		
		e.id = 101;
		
		e.salary = 1500.00;
		
		d.print(e);
	}
	void print(Employee e) {
		System.out.println(e.id+"---"+e.salary);
	}
}
