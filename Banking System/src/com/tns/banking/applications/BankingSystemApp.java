package com.tns.banking.applications;

import java.util.List;
import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        BankingService bankingService = new BankingServiceImpl();
        int accountID;
        int customerID;
        String type;
        double balance;
        int beneficiaryID;
        String name;
        String accountNumber;
        String bankDetails;
        String address;
        String contact;
        int transactionID;
        double amount;
        int ch;
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. Find All Accounts of specific Customer");
            System.out.println("7. Find All Transactions of specific Account");
            System.out.println("8. Find All Beneficiaries of specific Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            sc.nextLine(); // Clear the buffer

            switch (ch) {
                case 1:
                    System.out.println("Enter Customer Details");
                    System.out.print("Customer ID: ");
                    int customerID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    Customer customer = new Customer(customerID, name, address, contact);
                    bankingService.addCustomer(customer);
                    break;

                case 2:
                    System.out.println("Enter Account Details");
                    System.out.print("Account ID: ");
                    int accountID = sc.nextInt();
                    System.out.print("Customer ID: ");
                    customerID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Account Type (Saving/Current): ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double balance = sc.nextDouble();
                    Account account = new Account(accountID, customerID, type, balance);
                    bankingService.addAccount(account);
                    break;

                case 3:
                    System.out.println("Enter Beneficiary Details");
                    System.out.print("Customer ID: ");
                    customerID = sc.nextInt();
                    System.out.print("Beneficiary ID: ");
                    int beneficiaryID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Beneficiary Name: ");
                    name = sc.nextLine();
                    System.out.print("Beneficiary Account No.: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Beneficiary Bank details: ");
                    String bankDetails = sc.nextLine();
                    Beneficiary beneficiary = new Beneficiary(customerID, beneficiaryID, name, accountNumber, bankDetails);
                    bankingService.addBeneficiary(beneficiary);
                    break;

                case 4:
                    System.out.println("Enter Transaction Details");
                    System.out.print("Account ID: ");
                    accountID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Deposit/Withdraw): ");
                    type = sc.nextLine();
                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    Transaction transaction = new Transaction(accountID, type, amount);
                    bankingService.addTransaction(transaction);
                    break;

                case 5:
                    System.out.println("All Customers:");
                    for (Customer c : bankingService.getAllCustomer()) {
                        System.out.println("Customer ID: " + c.getCustomerID() + ", Name: " + c.getName());
                    }
                    System.out.print("Enter Customer ID to search: ");
                    customerID = sc.nextInt();
                    Customer foundCustomer = bankingService.findCustomerById(customerID);
                    if (foundCustomer != null) {
                        System.out.println("Customer: " + foundCustomer.getName() + ", Address: " + foundCustomer.getAddress() + ", Contact: " + foundCustomer.getContact());
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Customer ID: ");
                    customerID = sc.nextInt();
                    List<Account> customerAccounts = bankingService.getAccountsByCustomerId(customerID);
                    if (customerAccounts.isEmpty()) {
                        System.out.println("No accounts found for customer ID " + customerID);
                    } else {
                        System.out.println("Accounts for Customer ID " + customerID + ":");
                        for (Account acc : customerAccounts) {
                            System.out.println("Account ID: " + acc.getAccountID() + ", Type: " + acc.getType() + ", Balance: " + acc.getBalance());
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter Account ID: ");
                    accountID = sc.nextInt();
                    List<Transaction> accountTransactions = bankingService.getTransactionsByCustomerId(accountID); // <-- fixed method name
                    if (accountTransactions.isEmpty()) {
                        System.out.println("No transactions found for account ID " + accountID);
                    } else {
                        System.out.println("Transactions for Account ID " + accountID + ":");
                        for (Transaction t : accountTransactions) {
                            System.out.println("Transaction ID: " + t.getTransactionID() + ", Type: " + t.getType() + ", Amount: " + t.getAmount() + ", Timestamp: " + t.getTimestamp());
                        }
                    }
                    break;

                case 8:
                    System.out.print("Enter Customer ID: ");
                    customerID = sc.nextInt();
                    List<Beneficiary> customerBeneficiaries = bankingService.getBeneficiariesByCustomerId(customerID);
                    if (customerBeneficiaries.isEmpty()) {
                        System.out.println("No beneficiaries found for customer ID " + customerID);
                    } else {
                        for (Beneficiary b : customerBeneficiaries) {
                            System.out.println("Beneficiary ID: " + b.getBeneficiaryID() + ", Name: " + b.getName() + ", Account No.: " + b.getAccountNumber() + ", Bank: " + b.getBankDetails());
                        }
                    }
                    break;

                case 9:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }

        } while (ch != 9);

        sc.close();
    }
}

