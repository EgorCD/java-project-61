package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class CalcGame implements Game {
    private static Random random = new Random();
    private static String[] operations = {"+", "-", "*"};

    @Override
    public String getQuestion() {
        String newOperation = operations[random.nextInt(operations.length)];
        int[] numbers = {random.nextInt(100), random.nextInt(100)};
        return numbers[0] + " " + newOperation + " " + numbers[1];
    }

    @Override
    public String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        String operation = parts[1];
        int num2 = Integer.parseInt(parts[2]);

        if (operation.equals("+")) {
            return String.valueOf(num1 + num2);
        } else if (operation.equals("-")) {
            return String.valueOf(num1 - num2);
        } else {
            return String.valueOf(num1 * num2);
        }
    }
}

