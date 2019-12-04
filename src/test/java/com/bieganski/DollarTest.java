package com.bieganski;

import org.junit.Assert;
import org.junit.Test;

public class DollarTest {

    @Test
    public void testMulti(){
        Money five = Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), five.times(2));
        Assert.assertEquals(Money.dollar(25), five.times(5));
    }
    @Test
    public void testFrancMulti(){
        Money five = Money.franc(5);
        Assert.assertEquals(Money.franc(10), five.times(2));
        Assert.assertEquals(Money.franc(25), five.times(5));
    }
    @Test
    public void testEquality(){
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(15).equals(Money.dollar(6)));
        Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
        Assert.assertFalse(Money.franc(35).equals(Money.franc(6)));
        Assert.assertFalse(Money.dollar(7).equals(Money.franc(7)));
    }
    @Test
    public void testEquality2(){
        Assert.assertEquals(new Dollar(5), new Dollar(5));
    }
}
