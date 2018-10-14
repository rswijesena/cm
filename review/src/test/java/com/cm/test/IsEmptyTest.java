package com.cm.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IsEmptyTest {

    @Test
    public void testIsEmptyWithText() {
        boolean isEmpty = UtilMethods.isNullOREmpty("hello");
        assertEquals(false,isEmpty);
    }

    @Test
    public void testIsEmptyWithNull() {
        boolean isEmpty = UtilMethods.isNullOREmpty("");
        assertEquals(true,isEmpty);
    }

    @Test
    public void testIsEmptyWithNullValue() {
        boolean isEmpty = UtilMethods.isNullOREmpty(null);
        assertEquals(true,isEmpty);
    }

    @Test
    public void testIsEmptyWithSingleLetter() {
        boolean isEmpty = UtilMethods.isNullOREmpty("a");
        assertEquals(false,isEmpty);
    }



}
