package com.bieganski;

import java.util.Objects;

public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    Money times(int number) {
        return Money.franc(amount * number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
