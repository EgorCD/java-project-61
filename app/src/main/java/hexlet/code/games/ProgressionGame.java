package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class ProgressionGame implements Game {
    private int start;
    private int step;
    private int index;
    private int progressionLength;

    @Override
    public String getQuestion() {
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

    @Override
    public String getCorrectAnswer(String question) {
        return String.valueOf(start + step * index);
    }

    private void generateProgression() {
        Random random = new Random();
        start = random.nextInt(10); // Progression start
        step = random.nextInt(10) + 1; // Progression step
        progressionLength = random.nextInt(6) + 5; // Progression length
        index = random.nextInt(progressionLength); // Index to hide
    }
}

