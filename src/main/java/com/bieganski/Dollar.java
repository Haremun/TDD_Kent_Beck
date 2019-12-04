package com.bieganski;

import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int number) {
        return new Dollar(amount * number);
    }



    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
