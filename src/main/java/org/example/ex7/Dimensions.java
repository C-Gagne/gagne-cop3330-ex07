/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex7;

import java.util.Scanner;

public class Dimensions {
        public static Integer setDimension()
        {
            Scanner newDimension = new Scanner(System.in);
            return Integer.parseInt(newDimension.nextLine());
        }
}
