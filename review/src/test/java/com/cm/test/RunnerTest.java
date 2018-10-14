package com.cm.test;

import org.junit.Test;


public class RunnerTest {


    @Test
    public void testIsMainConstruction() {
        new Runner();
    }

    /**
     * This test is doing nothing as it is the start up method. But we keep it to make code coverage 100%
     */
    @Test
    public void testIsMain() throws InvalidTriangleException {
        Runner.main(new String[]{"5","5","5"});
    }

}
