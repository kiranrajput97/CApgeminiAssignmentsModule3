package com.cg.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	AddressData addressdata;
	 public AddressData getAddressdata() {
			return addressdata;
		}
	    @Autowired
		public void setAddressdata(AddressData addressdata) {
			this.addressdata = addressdata;
		}
   Address()
   {
	   System.out.println("We are in Address class");
   }
   public void data()
   {
	  
	   System.out.println("We are in Address class and its function"); 
   }
   public String grandchild()
   {
	  return addressdata.Adddata();
   }
    
}
