package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    private static int rounds = 3;
    private static String gameExplanation = "What number is missing in the progression?";
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

        int start = random.nextInt(100);
        int step = random.nextInt(10) + 1;
        int length = random.nextInt(10) + 5;
        int hidden = random.nextInt(length);

        StringBuilder progression = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == hidden) {
                progression.append(".. ");
                questionAndAnswer[1] = String.valueOf(start + step * i);
            } else {
                progression.append(start + step * i).append(" ");
            }
        }

        questionAndAnswer[0] = progression.toString().trim();
        return questionAndAnswer;
    }
}
