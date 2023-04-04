import java.util.Scanner;

public class PersonalFinanceApp {

    private static double income;
    private static double expenses;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your personal finance app!");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Please choose an option:");
            System.out.println("1. Track income");
            System.out.println("2. Track expenses");
            System.out.println("3. Create a budget");
            System.out.println("4. Get financial advice");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your income:");
                    income += scanner.nextDouble();
                    break;
                case 2:
                    System.out.println("Enter your expenses:");
                    expenses += scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("Enter your budget:");
                    double budget = scanner.nextDouble();
                    if (budget > income - expenses) {
                        System.out.println("Congratulations! You're within your budget!");
                    } else {
                        System.out.println("Uh-oh, you've exceeded your budget!");
                    }
                    break;
                case 4:
                    if (income == 0) {
                        System.out.println("You need to track your income first.");
                    } else if (expenses == 0) {
                        System.out.println("You need to track your expenses first.");
                    } else if (income - expenses > 0) {
                        System.out.println("You're doing great! Your income is greater than your expenses.");
                    } else if (income - expenses < 0) {
                        System.out.println("You might want to cut back on your expenses.");
                    } else {
                        System.out.println("You're breaking even.");
                    }
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
        System.out.println("Thank you for using your personal finance app!");
    }
}
