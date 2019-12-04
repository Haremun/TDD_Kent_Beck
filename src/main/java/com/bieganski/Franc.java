package com.bieganski;

import java.util.Objects;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int number) {
        return new Franc(amount * number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
