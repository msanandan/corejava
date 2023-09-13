package com.methods;


public class Java_Methods {
	
	public static void main(String[] args) {
		
		
      Driver d = new Driver();
			
		Student_Employee s = new Student_Employee();
		s.id = 101;
		s.name = "raju";
		
		d.print(s);
	}

	void print(Student_Employee s) {
		System.out.println(s.id + "  " + s.name);
	}

}

class Student {
	int id;
	String name;
}
