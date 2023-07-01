package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            displayOptions();

            int choice = getUserChoice(input);
            input.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    return;
                case 1:
                    Cli.greetUser();
                    break;
                case 2:
                    EvenGame.run();
                    break;
                case 3:
                    CalcGame.run();
                    break;
                case 4:
                    GCD.run();
                    break;
                case 5:
                    ProgressionGame.run();
                    break;
                case 6:
                    PrimeGame.run();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
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
