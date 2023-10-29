package DesignPatterns._0_SOLID_Principles;

public class _3_LiskovSubstitutionPrinciple {

    /**
     *
     * Definition: Objects in a program should be replaceable with instances of their subtypes
     * without altering the correctness of that program.
     *
     * If class A is a subtype of class B, then we should be able to replace B with A without
     * altering the behavior of the program.
     *
     * This is achieved by making sure that the subtypes adhere to the contract of the supertype.
     *
     *      Example:
     *          - You have a class called Rectangle.java which has a width and a height.
     *          - You have a class called Square.java which extends Rectangle.java.
     *          - You want to calculate the area of a rectangle.
     *          - You can use the Rectangle class to calculate the area.
     *          - You can also use the Square class to calculate the area.
     *          - This way, you don't have to modify the Rectangle class.
     *          - This is because the Square class adheres to the contract of the Rectangle class.
     */

}
