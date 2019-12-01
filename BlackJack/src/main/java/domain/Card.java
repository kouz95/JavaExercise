package main.java.domain;

import utils.Pair;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
    private static final int TOTAL_NUM = 52;
    private static final int SAME_PATTERN_NUM = 13;
    private static final int MAX_VALUE_OF_NUM = 10;
    private static final String[] PATTERN = {"SPADE", "DIAMOND", "HEART", "CLOVER"};

    private ArrayList<Pair<String, Integer>> deckList = setDefaultDeck();

    public Card() {
        Collections.shuffle(deckList);
    }

    public ArrayList<Pair<String, Integer>> getDeckList() {
        return deckList;
    }

    private ArrayList<Pair<String, Integer>> setDefaultDeck() {
        ArrayList<Pair<String, Integer>> defaultDeck = new ArrayList<>();
        for (String str : PATTERN) {
            setPatternOf(defaultDeck, str);
        }
        return defaultDeck;
    }

    private void setPatternOf(ArrayList<Pair<String, Integer>> deck, String pattern) {
        for(int i = 1 ; i <= SAME_PATTERN_NUM ; i++) {
            if(i >= MAX_VALUE_OF_NUM) {
                deck.add(Pair.of(pattern, MAX_VALUE_OF_NUM));
            }
            deck.add(Pair.of(pattern, i));
        }
    }
}
