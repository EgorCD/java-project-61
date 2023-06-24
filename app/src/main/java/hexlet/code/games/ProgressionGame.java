package hexlet.code.games;

import java.util.Random;

public class ProgressionGame {
    private static Random random = new Random();

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int start = random.nextInt(10); // Progression start
            int step = random.nextInt(10) + 1; // Progression step
            int progressionLength = random.nextInt(6) + 5; // Progression length
            int index = random.nextInt(progressionLength); // Index to hide

            StringBuilder progression = new StringBuilder();
            for (int j = 0; j < progressionLength; j++) {
                if (j == index) {
                    progression.append(".. ");
                } else {
                    progression.append(start + step * j).append(" ");
                }
            }

            String question = progression.toString();
            String answer = String.valueOf(start + step * index);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }

        return questionsAndAnswers;
    }
}
