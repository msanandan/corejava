package com.oops;

public class Account {
	
	private long acc_no;
	
	private String name,email;
	
	private float amount;
	
  public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;

	}
     public long getacc_no() {
	    return acc_no;
     }
     
     public void setName(String Name) {  
 	    this.name = Name; 
}
       public String getName() {  
	    return name;  
	}  


  public void setEmail(String email) {  
    	    this.email = email; 
}
  public String getEmail() {  
	    return email;  
	}  

  public void setAmount(float amount) {  
	    this.amount = amount;  
	}  
  public float getAmount() {  
	    return amount;  
	}  
  
}