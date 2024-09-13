package org.example.cards;

public class Card implement Comparable<Card> {

    private Suit suit;
    private FaceValue faceValue;

    private Card() {
    }

    public Card(Suit suit, FaceValue faceValue) {
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }
    @Override
            public int compareTo(Card o) {
        return 0;
    }
}
