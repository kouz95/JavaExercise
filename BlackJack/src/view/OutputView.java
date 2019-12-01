package view;

import main.java.domain.ScoreCalculator;
import utils.Pair;

import java.util.ArrayList;

public class OutputView {
    public static void showCardsPool(ArrayList<Pair<String, Integer>> cardsPool) {
        int score = ScoreCalculator.getScore(cardsPool);
        for(int i = 0; i < cardsPool.size(); i++) {
            System.out.print(cardsPool.get(i).getLeft());
            if(cardsPool.get(i).getRight() == 1) {
                System.out.print(" "+ "A" + "   ");
                continue;
            }
            if(cardsPool.get(i).getRight() == 11) {
                System.out.print(" "+ "J" + "   ");
                continue;
            }
            if(cardsPool.get(i).getRight() == 12) {
                System.out.print(" "+ "Q" + "   ");
                continue;
            }
            if(cardsPool.get(i).getRight() == 13) {
                System.out.print(" "+ "K" + "   ");
                continue;
            }
            System.out.print(" "+ cardsPool.get(i).getRight() + "   ");
        }
        System.out.println("Score: " + score);
    }

    public static void printLoseMessage() {
        System.out.println("Lose");
    }

    public static void printWinningMessage() {
        System.out.println("Win");
    }
}
