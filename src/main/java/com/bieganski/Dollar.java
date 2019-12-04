package com.bieganski;

public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int number) {
        return new Dollar(amount * number);
    }
}
