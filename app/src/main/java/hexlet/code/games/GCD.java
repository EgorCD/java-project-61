package hexlet.code.games;

import java.util.Random;

public class GCD {
    private static Random random = new Random();

    public static String getQuestion() {
        int number1 = random.nextInt(100) + 1;  // adding 1 to avoid zero
        int number2 = random.nextInt(100) + 1;  // adding 1 to avoid zero
        return number1 + " " + number2;
    }

    public static String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");
        int number1 = Integer.parseInt(parts[0]);
        int number2 = Integer.parseInt(parts[1]);
        return String.valueOf(getGCD(number1, number2));
    }

    private static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }
}
