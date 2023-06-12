package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choice = getUserChoice(input);
            input.nextLine();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else if (choice == 1) {
                Cli.greetUser();
            } else if (choice == 2) {
                EvenGame.playGame();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    private static void displayMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    private static int getUserChoice(Scanner input) {
        return input.nextInt();
    }
}
