package com.cm.test;

/**
 * This is the main class for this project
 */

public class Runner {

    public static void main(String args[]) throws InvalidTriangleException {


        boolean isEmpty = UtilMethods.isNullOREmpty("a");
        System.out.println("Running isNullOREmptyMethod" + isEmpty);
        System.out.println("Running findDivisers method");
        System.out.println("Diviers list of the given number is " + UtilMethods.findDivisers(10));
        System.out.println("Area of the triangle " + UtilMethods.area(3, 3, 2));
        int[] testArr = new int[]{1,2,3,4,5,6,7,8};
        //print the common element array
        System.out.println("Find common elements");
        for(int i : UtilMethods.findMostCommonNumbers(testArr)){
            System.out.println(i);
        }
    }
}
