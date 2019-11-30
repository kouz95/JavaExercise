package main.java.domain;

import utils.Pair;

import java.util.ArrayList;

public class ScoreCalculator {
    public static int getScore(ArrayList<Pair<String, Integer>> cardsPool) {
        int score = 0;

        for (Pair<String, Integer> card : cardsPool) {
            score += card.getRight();
        }
        return score;
    }
}
