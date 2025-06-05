// 1. Static part: Bank class
class Bank {
    private static int totalAccounts = 0;

    public Bank() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

// 2. Abstract part: Account class and its subclasses
abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Checking Account.");
        }
    }
}

// 3. Final part: Transaction class
final class Transaction {
    private final double transactionFee = 2.5; // fixed fee

    public final void performTransaction(Account account, double amount, String type) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount - transactionFee);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}

// Main class to test everything
public class BankingTransactionSystem {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        System.out.println("Total bank accounts created: " + Bank.getTotalAccounts());

        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        Transaction transaction = new Transaction();

        transaction.performTransaction(savings, 200, "deposit");
        transaction.performTransaction(checking, 100, "withdraw");

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}