package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class CalcGame {
    private static final int ROUNDS = 3;
    private static final String EXPLANATION = "What is the result of the expression?";
    private static final Random RANDOM = new Random();
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void run() {
        String[][] questionsAndAnswers = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAndAnswers, EXPLANATION);
    }

    private static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];

        int number1 = RANDOM.nextInt(100);
        int number2 = RANDOM.nextInt(100);
        String operation = OPERATIONS[RANDOM.nextInt(OPERATIONS.length)];

        questionAndAnswer[0] = number1 + " " + operation + " " + number2;
        questionAndAnswer[1] = calculate(number1, number2, operation);

        return questionAndAnswer;
    }

    private static String calculate(int number1, int number2, String operation) {
        return switch (operation) {
            case "+" -> String.valueOf(number1 + number2);
            case "-" -> String.valueOf(number1 - number2);
            case "*" -> String.valueOf(number1 * number2);
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        };
    }
}
