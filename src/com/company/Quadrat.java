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

public class Quadrat extends Rectangle {

    private int sideA;


    // default empty constructor

    public Quadrat() {
    }

    /*
     * Class constructor with parameters
     * @param sideA int, set the Quadrat side A
     */

    public Quadrat(int sideA) {
        super(sideA, sideA);
        this.sideA = sideA;
    }

    /*
     * Getter for field Quadrat sideA (implements from Rectangle)
     * @return sideA of object Quadrat
     */
    @Override
    public int getSideA() {
        return sideA;
    }

    /*
     * Setter for field Quadrat sideA (implements from Rectangle)
     * @oaram sideA sets side A of object Quadrat
     */
    @Override
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }



    // Method toString() for class Quadrat
    @Override
    public String toString() {
        return "Quadrat{" +
                "sideA = " + sideA +
                '}';
    }
}
