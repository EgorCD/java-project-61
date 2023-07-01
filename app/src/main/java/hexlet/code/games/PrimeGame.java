package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {
    private static int rounds = 3;
    private static String gameExplanation = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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

        int number = random.nextInt(100) + 1;
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

