package com.tns.banking.entities;

public class Customer 
	{
		private int CustomerID;
		private String Name;
		private String Address;
		private String Contact;
		
		//Constructor, Getters and Setters
		public Customer(int CustomerID, String Name,String Address, String Contact)
		{
			this.CustomerID=CustomerID;
			this.Name=Name;
			this.Address=Address;
			this.Contact=Contact;
		}
		
		//Getters
		public int getCustomerID() 
		{
			return CustomerID;
		}
		public String getName() 
		{
			return Name;
		}
		public String getAddress() 
		{
			return Address;
		}
		public String getContact() 
		{
			return Contact;
		}
		
		//Setters
		public void setName(String name) {
			Name = name;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public void setContact(String contact) {
			Contact = contact;
		}
		
}
