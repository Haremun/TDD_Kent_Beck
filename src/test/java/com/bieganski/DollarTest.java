package com.bieganski;

import org.junit.Assert;
import org.junit.Test;

public class DollarTest {

    @Test
    public void testMulti(){
        Dollar five = new Dollar(5);
        Assert.assertEquals(new Dollar(10), five.times(2));
        Assert.assertEquals(new Dollar(25), five.times(5));
    }
    @Test
    public void testFrancMulti(){
        Franc five = new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(25), five.times(5));
    }
    @Test
    public void testEquality(){
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
        Assert.assertFalse(new Franc(5).equals(new Franc(6)));
    }
    @Test
    public void testEquality2(){
        Assert.assertEquals(new Dollar(5), new Dollar(5));
    }
}
