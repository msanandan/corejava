package com.oops;

public class TestAccount {
	
	public static void main(String[] args) {
		
	
	
  Account acc=new Account();
  
  acc.setAcc_no(915010032248591L);
  
  acc.setName("sanandan");
  
  acc.setEmail("sanandan@gmail");
  
  acc.setAmount(500000f);
  
  System.out.println(acc.getacc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}
}
