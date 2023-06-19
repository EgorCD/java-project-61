package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            displayOptions();

            int choice = getUserChoice(input);
            input.nextLine();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else if (choice == 1) {
                Cli.greetUser();
            } else if (choice == 2) {
                Engine.playGame("Even");
            } else if (choice == 3) {
                Engine.playGame("Calc");
            } else if (choice == 4) {
                Engine.playGame("GCD");
            } else if (choice == 5) {
                Engine.playGame("Progression");
            } else if (choice == 6) {
                Engine.playGame("Prime");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }

    private static void displayOptions() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    private static int getUserChoice(Scanner input) {
        return input.nextInt();
    }
}



