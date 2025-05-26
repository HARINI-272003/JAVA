package com.tns.banking.entities;

public class Beneficiary 
	{
		private int BeneficiaryID;
		private int CustomerID;
		private String Name;
		private String AccountNumber;
		private String BankDetails;
		
		//Constructor
		public Beneficiary(int BeneficiaryID, int CustomerID, String Name, String AccountNumber,String BankDetails)
		{
			this.BeneficiaryID=BeneficiaryID;
			this.CustomerID=CustomerID;
			this.Name=Name;
			this.AccountNumber=AccountNumber;
			this.BankDetails=BankDetails;
		}
		
		//Getters
		public int getBeneficiaryID() {
			return BeneficiaryID;
		}
		public int getCustomerID() {
			return CustomerID;
		}
		public String getName() {
			return Name;
		}
		public String getAccountNumber() {
			return AccountNumber;
		}
		public String getBankDetails() {
			return BankDetails;
		}
		
		//Setters
		public void setName(String name) {
			Name = name;
		}
		public void setAccountNumber(String accountNumber) {
			AccountNumber = accountNumber;
		}
		public void setBankDetails(String bankDetails) {
			BankDetails = bankDetails;
		}

}
