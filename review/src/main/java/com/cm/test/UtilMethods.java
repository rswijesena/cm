package com.cm.test;

import java.util.*;


/**
 * This class expose a method to find provided string whether its null or empty
 */
public class UtilMethods {

    //private constructor to avoid the class initiations.
    private UtilMethods() {
    }

    /**
     * This method take one string parameter and check whether if it is null or empty then it will return false.
     *
     * @param str
     * @return true or false.
     */
    public static boolean isNullOREmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Find divisors of the given positive integer
     *
     * @param num
     * @return
     */
    public static List<Integer> findDivisers(int num) {
        List<Integer> list = new ArrayList<>();
        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        } else {
            for (int i = 1; i <= num; i++)
                if (num % i == 0)
                    list.add(i);
        }
        return list;
    }

    /**
     * This method take 3 parameters and will be return the area of a triangle.
     * The algorithm used here is https://www.petervis.com/mathematics/area_of_triangle/
     * area-of-a-triangle-given-3-sides-herons-formula.html
     *
     * @param edge1
     * @param edge2
     * @param edge3
     */
    public static double area(double edge1, double edge2, double edge3) throws InvalidTriangleException {
        double area;
        if (edge1 < 0 || edge2 < 0 || edge3 < 0) {
            throw new InvalidTriangleException("You can't have negative or zero values for triangle edges.");
        }
        double edgeS = (edge1 + edge2 + edge3) / 2;
        area = Math.sqrt(edgeS * (edgeS - edge1) * (edgeS - edge2) * (edgeS - edge3));
        if (Double.isNaN(area)) {
            throw new InvalidTriangleException("Invalid out put for the area");
        }
        return area;
    }

    /**
     * This method expect an integer array and will find most common numbers from the array and return those numbers as
     * a new array
     *
     * @param arr integer Array
     * @return integer Array
     */
    public static int[] findMostCommonNumbers(int[] arr) {

        if(arr.length == 0) {
            throw new IllegalArgumentException("you can't have an empty array");
        }

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> resList = new ArrayList<>();

        //loop the given array
        for (int i : arr) {
            //adding repeating elements to an set
            if (!set.add(i)) {
                //if it is a repeating element we add it to the list.
                resList.add(i);
            } else {
                //add element to the set
                set.add(i);
            }
        }
        //if we don't have any duplicate values we return the given array as it is.
        if (resList.size() == 0) {
            return arr;
        } else {
            //convert result array list to an array
            int[] resultArr = new int[resList.size()];
            for (int i = 0; i < resList.size(); i++) {
                resultArr[i] = resList.get(i);
            }
            return resultArr;
        }
    }
}
