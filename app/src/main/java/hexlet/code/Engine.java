package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    private static Scanner input = new Scanner(System.in);

    public static void playGame(String[][] questionsAndAnswers, String explanation) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(explanation);

        for (int i = 0; i < ROUNDS; i++) {
            String question = questionsAndAnswers[i][0];
            String correctAnswer = questionsAndAnswers[i][1];

            System.out.println("Question: " + question);
            String userAnswer = getUserAnswer();
            if (!userAnswer.equals(correctAnswer)) {
                printFailure(userAnswer, correctAnswer, name);
                return;
            }
            printSuccess();
        }
        printCongratulations(name);
    }

    private static String getUserAnswer() {
        System.out.print("Your answer: ");
        return input.nextLine();
    }

    private static void printFailure(String userAnswer, String correctAnswer, String name) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + name + "!");
    }

    private static void printSuccess() {
        System.out.println("Correct!");
    }

    private static void printCongratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
}
