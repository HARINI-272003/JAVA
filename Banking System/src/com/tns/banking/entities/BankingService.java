package com.tns.banking.entities;

import java.util.Collection;
import java.util.List;

public interface BankingService 
	{
		void addCustomer(Customer customer);
		void addAccount(Account account);
		void addTransaction(Transaction transaction);
		void addBeneficiary(Beneficiary beneficiary);
		
		Customer findCustomerById(int id);
		Account findAccountById(int id);
		Transaction findTransactionById(int id);
		Beneficiary findBeneficiaryById(int id);
		
		Collection<Account> getAllAccounts();
		Collection<Customer> getAllCustomer();
		Collection<Transaction> getAllTransaction();
		Collection<Beneficiary> getAllBeneficiary();
		
		List<Account> getAccountsByCustomerId(int customerId);
		List<Transaction> getTransactionsByCustomerId(int customerId);
		List<Beneficiary> getBeneficiariesByCustomerId(int customerId);
}
