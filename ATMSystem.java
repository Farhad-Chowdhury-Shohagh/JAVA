import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin = 1234;
        double balance = 5000.00;

        System.out.println("--- ATM System ---");
        System.out.print("Enter PIN: ");
        int enteredPin = input.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN! Access denied.");
            input.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = input.nextDouble();

                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdraw successful!");
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}