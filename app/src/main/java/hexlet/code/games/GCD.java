package hexlet.code.games;

import java.util.Random;

public class GCD {
    private static Random random = new Random();

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(100) + 1;  // adding 1 to avoid zero
            int number2 = random.nextInt(100) + 1;  // adding 1 to avoid zero
            String question = number1 + " " + number2;
            String answer = String.valueOf(getGCD(number1, number2));

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }

        return questionsAndAnswers;
    }

    private static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }
}

