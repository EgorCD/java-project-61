package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int ROUNDS = 3;
    private static final String EXPLANATION = "Find the greatest common divisor of given numbers.";
    private static final Random RANDOM = new Random();

    public static void run() {
        String[][] questionsAndAnswers = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAndAnswers, EXPLANATION);
    }

    private static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];

        int number1 = RANDOM.nextInt(100) + 1;
        int number2 = RANDOM.nextInt(100) + 1;

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

