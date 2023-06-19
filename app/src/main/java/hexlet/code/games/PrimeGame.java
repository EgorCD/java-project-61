package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class PrimeGame implements Game {
    private int number;

    @Override
    public String getQuestion() {
        Random random = new Random();
        number = random.nextInt(100) + 1; // Random number between 1 and 100
        return String.valueOf(number);
    }

    @Override
    public String getCorrectAnswer(String question) {
        return isPrime(number) ? "yes" : "no";
    }

    private boolean isPrime(int num) {
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
