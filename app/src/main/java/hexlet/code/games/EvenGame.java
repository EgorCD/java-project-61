package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static final int ROUNDS = 3;
    private static final String EXPLANATION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final Random RANDOM = new Random();

    public static void run() {
        String[][] questionsAndAnswers = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAndAnswers, EXPLANATION);
    }

    private static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];

        int number = RANDOM.nextInt(100);
        questionAndAnswer[0] = String.valueOf(number);
        questionAndAnswer[1] = isEven(number) ? "yes" : "no";

        return questionAndAnswer;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}


