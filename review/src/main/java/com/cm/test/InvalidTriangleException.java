package com.cm.test;

/**
 * This is a custom exception class made for return exception on an error of triangle area method.
 */
public class InvalidTriangleException extends Exception {
    /**
     * Override Exception class method with two params
     * @param errorMessage
     * @param err
     */

    /**
     * Override Exception super class method with single param
     * @param errorMessage
     */
    public InvalidTriangleException(String errorMessage){
        super(errorMessage);
    }

}
