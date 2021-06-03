/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex7;

public class MetricConversion {
    public static Double calculateMetric(Integer area)
    {
        Double conversionSqFtToM = 10.764;
        return area/conversionSqFtToM;
    }
}
