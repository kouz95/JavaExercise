package main.java.domain;

import utils.Pair;

import java.util.ArrayList;

public class Player {
    private ArrayList<Pair<String, Integer>> cardsPool;

    public Player() {
        cardsPool = new ArrayList<>();
    }

    public ArrayList<Pair<String, Integer>> getCardsPool() {
        return cardsPool;
    }

    public void drawFromDeck(ArrayList<Pair<String, Integer>> deck) {
        cardsPool.add(CardHandler.DrawCard(deck));
    }
}