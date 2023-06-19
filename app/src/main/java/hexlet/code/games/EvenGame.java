package hexlet.code.games;

import java.util.Random;

public class EvenGame {
    private static Random random = new Random();

    public static String getQuestion() {
        int number = random.nextInt(100);
        return String.valueOf(number);
    }

    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return number % 2 == 0 ? "yes" : "no";
    }

}

