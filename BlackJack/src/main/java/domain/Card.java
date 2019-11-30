package main.java.domain;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
    private static final int TOTAL_NUM = 52;
    private static final int SAME_PATTREN_NUM = 13;
    private static final int MAX_VALUE_OF_NUM = 10;
    private static final String[] PATTERN = {"SPADE", "DIAMOND", "HEART", "CLOVER"};

    private ArrayList<Pair> deckList = setDefalutDeck();

    public Card() {
        Collections.shuffle(deckList);
    }

    private ArrayList<Pair> setDefalutDeck() {
        ArrayList<Pair> defalutDeck = new ArrayList<>();
        for (String str : PATTERN) {
            setPatternOf(defalutDeck, str);
        }
        return defalutDeck;
    }

    private void setPatternOf(ArrayList<Pair> deck, String pattern) {
        for(int i = 1 ; i <= SAME_PATTREN_NUM ; i++) {
            if(i >= MAX_VALUE_OF_NUM) {
                deck.add(Pair.of(pattern,MAX_VALUE_OF_NUM));
            }
            deck.add(Pair.of(pattern, i));
        }
    }
}
