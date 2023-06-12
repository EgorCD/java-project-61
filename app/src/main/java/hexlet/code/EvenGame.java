package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
        private static Scanner input = new Scanner(System.in);
        private static Random random = new Random();
        private static String name;

        public static void playGame() {
            greetUser();
            runGame();
        }

        // Greeting user and explaining the rules
        private static void greetUser() {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            name = input.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }

        // Running the game
        private static void runGame() {
            for (int i = 0; i < 3; i++) {
                int number = generateRandomNumber();
                if (!askQuestion(number)) {
                    printFailure(number);
                    return;
                }
                printSuccess();
            }
            printCongratulations();
        }

        // Generating random number
        private static int generateRandomNumber() {
            return random.nextInt(100); // generate a random number between 0 and 99
        }

        // Asking user a question
        private static boolean askQuestion(int number) {
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = input.nextLine();

            if (number % 2 == 0) {  // if number is even
                return answer.equals("yes");
            } else {  // if number is odd
                return answer.equals("no");
            }// if user answer is incorrect
        }

        private static void printFailure(int number) {
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.println("'no' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
        }

        // Printing success message
        private static void printSuccess() {
            System.out.println("Correct!");
        }

        // Printing congratulations message
        private static void printCongratulations() {
            System.out.println("Congratulations, " + name + "!");
        }
}
