/*
 *
 * Programming patterns. Factory, Builder.
 *
 *  13 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 4
 *
 *Develop for your class
 *1. Factory.
 *2. Abstract factory.
 *3. Create a class Student  - 25 fields.
 *4. Create a builder for the class Student/
 *
 */
package com.company;

import java.util.Objects;

public class Rectangle {

    private int sideA;
    private int sideB;
    // default empty constructor
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    /*
     * Class constructor with parameters
     * @param int sideA, set the Rectangle sideA
     * @param int sideB, set the Rectangle sideB
     */

    public Rectangle() {
    }
    /*
     * Getter for field Rectangle sideA
     * @return sideA of object Rectangle
     */
    public int getSideA() {
        return sideA;
    }
    /*
     * Setter for field Rectangle sideA
     * @param sideA sets side A of object Rectangle
     */

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    /*
     * Getter for field Rectangle sideB
     * @return sideB of object Rectangle
     */

    public int getSideB() {
        return sideB;
    }
    /*
     * Setter for field Rectangle sideB
     * @oaram sideB sets side B of object Rectangle
     */

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    // Method toString() for class Rectangle

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}