package main.java.domain;

import utils.Pair;

import java.util.ArrayList;

public class Gamer {
    private ArrayList<Pair<String, Integer>> cardsPool;

    public Gamer() {
        cardsPool = new ArrayList<>();
    }

    public void drawCard(ArrayList<Pair<String, Integer>> deck) {
        cardsPool.add(CardHandler.DrawCard(deck));
    }
}
