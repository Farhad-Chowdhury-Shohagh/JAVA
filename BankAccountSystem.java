import java.util.Scanner;

class Account {
    int accountNumber;
    String name;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void checkBalance() {
        System.out.printf("Current Balance: %.2f%n", balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter account number: ");
        account.accountNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter account holder name: ");
        account.name = input.nextLine();

        System.out.print("Enter initial balance: ");
        account.balance = input.nextDouble();

        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the bank system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}
