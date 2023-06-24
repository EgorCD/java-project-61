package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    private static Random random = new Random();

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100) + 1; // Random number between 1 and 100
            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }

        return questionsAndAnswers;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


