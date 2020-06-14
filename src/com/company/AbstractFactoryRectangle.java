/*
 *
 * Programming patterns. Factory, Builder.
 *
 * 13 June 2020
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

import com.company.Rectangle;
import com.company.Quadrat;



public class AbstractFactoryRectangle {

    /*
     * AbstractFactoryRectangle with parameters
     * @param sideA int, set the Rectangle or Quadrat side A
     * @param sideB int, set the Rectangle side B
     * @param angle int, set the Rectangle or Quadrat angle
     */
    public static Rectangle create(int sideA, int sideB){
        if (sideA == sideB) {return
                new Quadrat(sideA);
        } else return
                new Rectangle(sideA, sideB);

    }
}