package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    private static int number;

    public static String getQuestion() {
        Random random = new Random();
        number = random.nextInt(100) + 1; // Random number between 1 and 100
        return String.valueOf(number);
    }

    public static String getCorrectAnswer(String question) {
        return isPrime(number) ? "yes" : "no";
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
