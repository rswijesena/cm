package com.cm.test;

import org.junit.Assert;
import org.junit.Test;

public class CommonElementTest {

    @Test
    public void testCommonElementsWithNoRepeatValues() {
        int[] testArr = new int[]{1,2,3,4,5,6,7,8};
        int[] resultArr = UtilMethods.findMostCommonNumbers(testArr);

        int[] assertArray = new int[]{1,2,3,4,5,6,7,8};
        Assert.assertArrayEquals( resultArr, assertArray );
    }

    @Test
    public void testCommonElementsWithRepeatValues() {
        int[] testArr = new int[]{1,2,3,4,5,5,6,6,7,8};
        int[] resultArr = UtilMethods.findMostCommonNumbers(testArr);

        int[] assertArray = new int[]{5,6};
        Assert.assertArrayEquals( resultArr, assertArray );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCommonElementsWithExceptionValues() {
        int[] testArr = new int[]{};
        UtilMethods.findMostCommonNumbers(testArr);
    }

}
