package hexlet.code;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class Engine {
    private static Scanner input = new Scanner(System.in);
    private static String name;

    public static void playGame(String gameType) {
        greetUser();
        for (int i = 0; i < 3; i++) {
            String question;
            String correctAnswer;

            if ("Even".equals(gameType)) {
                question = EvenGame.getQuestion();
                correctAnswer = EvenGame.getCorrectAnswer(question);
            } else if ("Calc".equals(gameType)) {
                question = CalcGame.getQuestion();
                correctAnswer = CalcGame.getCorrectAnswer(question);
            } else if ("GCD".equals(gameType)) {
                question = GCD.getQuestion();
                correctAnswer = GCD.getCorrectAnswer(question);
            } else if ("Progression".equals(gameType)) {
                question = ProgressionGame.getQuestion();
                correctAnswer = ProgressionGame.getCorrectAnswer(question);
            } else if ("Prime".equals(gameType)) {
                question = PrimeGame.getQuestion();
                correctAnswer = PrimeGame.getCorrectAnswer(question);
            } else {
                throw new IllegalArgumentException("Invalid game type: " + gameType);
            }

            System.out.println("Question: " + question);
            String userAnswer = getUserAnswer();
            if (!userAnswer.equals(correctAnswer)) {
                printFailure(userAnswer, correctAnswer);
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

