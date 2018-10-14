package com.cm.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DivisorsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValues() {
       UtilMethods.findDivisers(-1);
    }

    @Test
    public void testDivisor() {
        List<Integer> list = UtilMethods.findDivisers(10);
        Integer[] values = new Integer[]{1, 2, 5, 10};
        List<Integer> answerList = Arrays.asList(values);
        Assert.assertEquals(list,answerList );
    }


}
