package com.cm.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleAreaTest  {

    @Test
    public void testTriangleArea() throws InvalidTriangleException {
        double area = UtilMethods.area(3,4,5);
        assertEquals(6.0,area,0.001);
    }

    @Test
    public void testForZeroForTriangle() throws InvalidTriangleException {
        double area = UtilMethods.area(0,0,0);
        assertEquals(0.0,area,0.000);
    }

    @Test(expected = InvalidTriangleException.class)
    public void testInvalidValuesForTriangle() throws InvalidTriangleException {
        UtilMethods.area(-13,-4,-5);
    }



    @Test(expected = InvalidTriangleException.class)
    public void testErrorTestForTriangle() throws Exception {
        UtilMethods.area(200000000000000000l, 4, 5);
    }
}
