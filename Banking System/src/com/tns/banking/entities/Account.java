package com.tns.banking.entities;

public class Account 
	{
		private int AccountID;
		private int CustomerID;
		private String Type;
		private double Balance;
		
		//Constructor
		public Account(int AccountID, int CustomerID, String Type, double Balance)
		{
			this.AccountID=AccountID;
			this.CustomerID=CustomerID;
			this.Type=Type;
			this.Balance=Balance;
		}
		
		//Getters
		public int getAccountID() {
			return AccountID;
		}
		public int getCustomerID() {
			return CustomerID;
		}
		public String getType() {
			return Type;
		}
		public double getBalance() {
			return Balance;
		}
		
		//Setters
		public void setType(String type) {
			Type = type;
		}
		public void setBalance(double balance) {
			Balance = balance;
		}
}
