package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static int rounds = 3;
    private static String gameExplanation = "Find the greatest common divisor of given numbers.";
    private static Random random = new Random();

    public static void run() {
        String[][] questionsAndAnswers = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAndAnswers, gameExplanation);
    }

    private static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];

        int number1 = random.nextInt(100) + 1;
        int number2 = random.nextInt(100) + 1;

        questionAndAnswer[0] = number1 + " " + number2;
        questionAndAnswer[1] = String.valueOf(gcd(number1, number2));

        return questionAndAnswer;
    }

    private static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }
}

