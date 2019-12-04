package com.bieganski;

import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
