package com.interface2;
public interface Bank {

	public void moneyTransfer();

	public void checkBalance();
}


public class Hdfc Bank implements Bank {

	public void moneyTransfer() {
		System.out.println("Money Transfer from HDFC....");
	}

	public void checkBalance() {
		System.out.println("Checking Balance from HDFC.....");
	}
}

public class AxisBank implements Bank {

	public void moneyTransfer() {
		System.out.println("Money Transfer from Axis ....");
	}

	public void checkBalance() {
		System.out.println("Check Balance from Axis....");
	}
}
