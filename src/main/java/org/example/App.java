/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final double gallon = 350;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = scan.nextInt();

        System.out.print("Enter width: ");
        int width = scan.nextInt();

        int totalsqfeet = length * width;
        double totalgallon = Math.ceil(totalsqfeet / gallon);
        int totalgallon1 = (int) totalgallon;

        System.out.print("You will need to purchase "+totalgallon1+" gallons of paint to cover "+totalsqfeet+" square feet.");

    }
}