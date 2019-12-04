package com.bieganski;

import org.junit.Assert;
import org.junit.Test;


public class DollarTest {

    @Test
    public void testMulti() {
        Money five = Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), five.times(2));
        Assert.assertEquals(Money.dollar(25), five.times(5));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(15).equals(Money.dollar(6)));
        Assert.assertFalse(Money.dollar(7).equals(Money.franc(7)));
    }

    @Test
    public void testEquality2() {
        Assert.assertEquals(Money.dollar(5), Money.dollar(5));
    }

    @Test
    public void testCurrency() {
        Assert.assertEquals("USD", Money.dollar(1).currency());
        Assert.assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(10), reduced);
    }
}
