package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static int rounds = 3;
    private static String gameExplanation = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static Random random = new Random();

    public static void run() {
        String[][] questionsAndAnswers = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAndAnswers, gameExplanation);
    }

    private static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];

        int number = random.nextInt(100);
        questionAndAnswer[0] = String.valueOf(number);
        questionAndAnswer[1] = isEven(number) ? "yes" : "no";

        return questionAndAnswer;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}


