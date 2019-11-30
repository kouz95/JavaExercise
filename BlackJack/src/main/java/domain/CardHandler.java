package main.java.domain;

import java.util.ArrayList;

public class CardHandler {
    public static Pair<String, Integer> DrawCard(ArrayList<Pair<String, Integer>> deck) {
        final int LAST_INDEX = deck.size() - 1;

        Pair<String, Integer> lastCard = deck.get(LAST_INDEX);
        deck.remove(LAST_INDEX);
        return lastCard;
    }
}
