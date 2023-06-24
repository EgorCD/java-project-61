package hexlet.code.games;

import java.util.Random;

public class EvenGame {
    private static Random random = new Random();

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            String question = String.valueOf(number);
            String answer = number % 2 == 0 ? "yes" : "no";

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }

        return questionsAndAnswers;
    }
}


