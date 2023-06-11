package hexlet.code;

import java.util.Scanner;

public class EvenGame {
        public static void play() {
            System.out.println("Welcome to the Brain Games!");
            Scanner input = new Scanner(System.in);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            int correctAnswers = 0;
            final int maxCorrectAnswers = 3;

            while (correctAnswers < maxCorrectAnswers) {
                int number = generateRandomNumber();
                System.out.println("Question: " + number);
                System.out.print("Your answer: ");
                String userAnswer = input.nextLine();
                boolean isEven = isEven(number);

                if ((isEven && userAnswer.equalsIgnoreCase("yes")) || (!isEven && userAnswer.equalsIgnoreCase("no"))) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "no" : "yes") + "'.");
                    System.out.println("Let's try again, " + "!");
                    return;
                }
            }

            System.out.println("Congratulations, " + "!");
        }

        private static int generateRandomNumber() {
            double randomValue = Math.random() * 100;
            return (int) randomValue;
        }

        private static boolean isEven(int number) {
            return number % 2 == 0;
        }
}
