package com.epam.enums;

public enum Score {
    A(5), B(4), C(3), D(2), E(1), F(0);

    private int score;

    Score(int score) {
        this.score = score;
    }

    public int getScoreValue(){
        return this.score;
    }
}
