package org.example.cards;

import java.util.*;



public class StandardDeck implement Deck {

    private List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();
        Arrays.stream(Suit.values()).forEach(suit -> {

            Arrays.stream(FaceValue.values()).map(faceValue -> new Card(suit, faceValue)).forEach(newDeck::add);

        });
        return newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards, new Random(System.nanoTime()));

    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {

    }

    @Override
    public Card turnOver() {

    }

    @Override
    int search(Card card) {

    }

    @Override
    void newOrder(Deck cards) {

    }

    @Override
    public int size() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder
    }

}
