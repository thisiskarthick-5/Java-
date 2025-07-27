import java.util.Scanner;

// Main class with main method
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Create a bank account
        System.out.print("Enter account holder's name: ");
        String name = myObj.nextLine();

        System.out.print("Enter initial balance: ");
        int initialBalance = myObj.nextInt();

        // Create an object of Bank class
        Bank myAccount = new Bank(name, initialBalance);

        // Menu
        System.out.println("\n1. Account Detail");
        System.out.println("2. Balance");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");

        System.out.print("Enter the choice number: ");
        int choice = myObj.nextInt();

        switch (choice) {
            case 1:
                // Show account details
                System.out.println("\nAccount Holder: " + myAccount.holder);
                System.out.println("Balance: " + myAccount.balance);
                break;

            case 2:
                // Show balance
                myAccount.showBalance();
                break;

            case 3:
                // Deposit
                System.out.print("Enter amount to deposit: ");
                int depositAmount = myObj.nextInt();
                myAccount.deposit(depositAmount);
                break;

            case 4:
                // Withdraw
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = myObj.nextInt();
                myAccount.withdraw(withdrawAmount);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        myObj.close(); // Close the scanner
    }
}










class Bank {
    String holder;
    int balance;

    // Constructor
    Bank(String name, int initialBalance) {
        holder = name;
        balance = initialBalance;
    }

    // Deposit method
    void deposit(int amount) {
        balance += amount;
        System.out.println("\nDepositing...");
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance for " + holder + ": " + balance);
    }

    // Withdraw method
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawing...");
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Updated Balance for " + holder + ": " + balance);
        } else {
            System.out.println("\nInsufficient balance!");
        }
    }

    // Show balance
    void showBalance() {
        System.out.println("\nThe holder " + holder + " has balance: " + balance);
    }
}
