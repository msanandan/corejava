package com.objectExample1;

public class Driver {

	public static void main(String[] args) {

		Driver d = new Driver();

		person per = d.e1();

		System.out.println(per.id + "--" + per.name + "---" + per.age);
	}

	person e1() {

		person p = new person();

		p.id = 101;

		p.name = "Sanandan";

		p.age = 32;

		return p;
	}
}
