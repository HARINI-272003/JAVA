package com.tns.banking.entities;

import java.time.LocalDateTime;

public class Transaction 
	{
		private static int idCounter=1;
		private int TransactionID;
		private int AccountID;
		private String Type;
		private double Amount;
		private LocalDateTime Timestamp;
		
		//Constructor
		public Transaction(int AccountID, String Type, double Amount)
		{
			this.TransactionID=idCounter++;
			this.AccountID=AccountID;
			this.Type=Type;
			this.Amount=Amount;
			this.Timestamp=LocalDateTime.now();
		}
		
		//Getters
		public int getTransactionID() {
			return TransactionID;
		}
		public int getAccountID() {
			return AccountID;
		}
		public String getType() {
			return Type;
		}
		public double getAmount() {
			return Amount;
		}
		public LocalDateTime getTimestamp() {
			return Timestamp;
		}
	
}
