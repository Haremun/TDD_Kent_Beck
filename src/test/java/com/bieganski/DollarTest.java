package com.bieganski;

import org.junit.Assert;
import org.junit.Test;

public class DollarTest {

    @Test
    public void testMulti(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(5);
        Assert.assertEquals(25, product.amount);
    }
}
