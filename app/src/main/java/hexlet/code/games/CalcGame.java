package hexlet.code.games;

import java.util.Random;

public class CalcGame {
    private static Random random = new Random();
    private static String[] operations = {"+", "-", "*"};
    private static String explanation = "What is the result of the expression?";

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            String operation = operations[random.nextInt(operations.length)];

            questionsAndAnswers[i][0] = number1 + " " + operation + " " + number2;
            questionsAndAnswers[i][1] = calculate(number1, number2, operation);
        }

        return questionsAndAnswers;
    }

    private static String calculate(int number1, int number2, String operation) {
        if ("+".equals(operation)) {
            return String.valueOf(number1 + number2);
        } else if ("-".equals(operation)) {
            return String.valueOf(number1 - number2);
        } else if ("*".equals(operation)) {
            return String.valueOf(number1 * number2);
        } else {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}

