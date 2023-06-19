package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class EvenGame implements Game {
    private static Random random = new Random();

    @Override
    public String getQuestion() {
        int number = random.nextInt(100);
        return String.valueOf(number);
    }

    @Override
    public String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return number % 2 == 0 ? "yes" : "no";
    }

}

