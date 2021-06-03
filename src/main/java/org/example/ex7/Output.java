/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex7;

public class Output {
    public static String genOutput(Integer x, Integer y, Integer area, Double conversion)
    {
        return String.format("The area of a rectangle with a width of %d and length of %d is %d sq feet. \n That is %f sq meters.", x, y, area, conversion);
    }
}
