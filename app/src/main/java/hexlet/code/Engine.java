package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner input = new Scanner(System.in);
    private static String name;

    public static void playGame(Game newGame, String gameDescription) {
        greetUser();
        if (gameDescription != null) {
            System.out.println(gameDescription);
        }
        for (int i = 0; i < 3; i++) {
            String question = newGame.getQuestion();
            System.out.println("Question: " + question);
            String userAnswer = getUserAnswer();
            if (!userAnswer.equals(newGame.getCorrectAnswer(question))) {
                printFailure(userAnswer, newGame.getCorrectAnswer(question));
                return;
            }
            printSuccess();
        }
        printCongratulations();
    }

    private static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    private static String getUserAnswer() {
        System.out.print("Your answer: ");
        return input.nextLine();
    }

    private static void printFailure(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + name + "!");
    }

    private static void printSuccess() {
        System.out.println("Correct!");
    }

    private static void printCongratulations() {
        System.out.println("Congratulations, " + name + "!");
    }
}

