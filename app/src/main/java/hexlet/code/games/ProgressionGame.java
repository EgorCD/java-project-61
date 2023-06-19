package hexlet.code.games;

import java.util.Random;

public class ProgressionGame {
    private static int start;
    private static int step;
    private static int index;
    private static int progressionLength;

    public static String getQuestion() {
        generateProgression();
        StringBuilder progression = new StringBuilder();
        for (int i = 0; i < progressionLength; i++) {
            if (i == index) {
                progression.append(".. ");
            } else {
                progression.append(start + step * i).append(" ");
            }
        }
        return progression.toString();
    }

    public static String getCorrectAnswer(String question) {
        return String.valueOf(start + step * index);
    }

    private static void generateProgression() {
        Random random = new Random();
        start = random.nextInt(10); // Progression start
        step = random.nextInt(10) + 1; // Progression step
        progressionLength = random.nextInt(6) + 5; // Progression length
        index = random.nextInt(progressionLength); // Index to hide
    }
}

