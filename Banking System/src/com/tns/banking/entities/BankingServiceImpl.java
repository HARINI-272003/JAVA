package com.tns.banking.entities;

import java.util.*;
public class BankingServiceImpl implements BankingService
	{
	 	private Map<Integer, Customer> customers = new HashMap<>();
	    private Map<Integer, Account> accounts = new HashMap<>();
	    private Map<Integer, Transaction> transactions = new HashMap<>();
	    private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();

	    @Override
	    public void addCustomer(Customer customer) {
	        customers.put(customer.getCustomerID(), customer);
	    }

	    @Override
	    public void addAccount(Account account) {
	        accounts.put(account.getAccountID(), account);
	    }

	    @Override
	    public void addTransaction(Transaction transaction)
	    {
	    	transactions.put(transaction.getTransactionID(), transaction);
	    	Account account = accounts.get(transaction.getAccountID());
	    	if(account!=null)
	    	{
	    		if(transaction.getType().equalsIgnoreCase("deposit"))
	    		{
	    			account.setBalance(account.getBalance() + transaction.getAmount());
	    		}
	    		else if(transaction.getType().equalsIgnoreCase("withdrawal"))
	    		{
	    			account.setBalance(account.getBalance() - transaction.getAmount());
	    		}	
	    	}
	    }
	    
	    @Override
	    public void addBeneficiary(Beneficiary beneficiary) {
	        beneficiaries.put(beneficiary.getBeneficiaryID(), beneficiary);
	    }

	    @Override
	    public Customer findCustomerById(int id) {
	        return customers.get(id);
	    }

	    @Override
	    public Account findAccountById(int id) {
	        return accounts.get(id);
	    }

	    @Override
	    public Transaction findTransactionById(int id) {
	        return transactions.get(id);
	    }

	    @Override
	    public Beneficiary findBeneficiaryById(int id) {
	        return beneficiaries.get(id);
	    }

	    @Override
	    public List<Account> getAccountsByCustomerId(int customerId) {
	        List<Account> result = new ArrayList<>();
	        for (Account acc : accounts.values()) {
	            if (acc.getCustomerID() == customerId) {
	                result.add(acc);
	            }
	        }
	        return result;
	    }

	    public List<Transaction> getTransactionsByAccountId(int accountId) {
	        List<Transaction> result = new ArrayList<>();
	        for (Transaction transaction : transactions.values()) {
	            if (transaction.getAccountID() == accountId) {
	                result.add(transaction);
	            }
	        }
	        return result;
	    }

	    @Override
	    public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
	        List<Beneficiary> result = new ArrayList<>();
	        for (Beneficiary beneficiary : beneficiaries.values()) {
	            if (beneficiary.getCustomerID() == customerId) {
	                result.add(beneficiary);
	            }
	        }
	        return result;
	    }
	    @Override
	    public Collection<Account> getAllAccounts()
	    {
	    	return accounts.values();
	    }
	    public Collection<Customer> getAllCustomers()
	    {
	    	return customers.values();
	    }
	    public Collection<Transaction> getAllTransactions()
	    {
	    	return transactions.values();
	    }
	    public Collection<Beneficiary> getAllBeneficiaries()
	    {
	    	return beneficiaries.values();
	    }

		@Override
		public Collection<Customer> getAllCustomer() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<Transaction> getAllTransaction() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<Beneficiary> getAllBeneficiary() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Transaction> getTransactionsByCustomerId(int customerId) {
			// TODO Auto-generated method stub
			return null;
		}
}
