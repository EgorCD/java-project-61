package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {
    private static final int ROUNDS = 3;
    private static final String EXPLANATION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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

        int number = RANDOM.nextInt(100) + 1;
        questionAndAnswer[0] = String.valueOf(number);
        questionAndAnswer[1] = isPrime(number) ? "yes" : "no";

        return questionAndAnswer;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

