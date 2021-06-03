/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex7;


public class App {
    public static void main(String[] args)
    {
        Dimensions width = new Dimensions();
        Dimensions length = new Dimensions();
        AreaCalculation product = new AreaCalculation();
        MetricConversion sqMeters = new MetricConversion();

        System.out.println("What is the width of the rectangle?");
        Integer x = width.setDimension();
        System.out.println("What is the length of the rectangle?");
        Integer y = length.setDimension();

        Integer area = product.calculateArea(x, y);
        Double conversion = sqMeters.calculateMetric(area);

        Output out = new Output();
        String finalString = out.genOutput(x,y,area,conversion);
        System.out.println(finalString);

    }
}
