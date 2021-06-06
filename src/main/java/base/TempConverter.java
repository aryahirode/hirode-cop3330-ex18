/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class TempConverter {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        TempConverter myApp = new TempConverter();
        myApp.output();
    }

    private String unitPrompt() {
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        return in.nextLine().toUpperCase();
    }

    private int tempFPrompt() {
        System.out.print("Please enter the temperature in Fahrenheit: ");
        return Integer.parseInt(in.nextLine());
    }

    private int tempCPrompt() {
        System.out.print("Please enter the temperature in Celsius: ");
        return Integer.parseInt(in.nextLine());
    }

    private int calculations(String unit, int temp) {
        if (unit.equals("F")) {
            return (temp * 9 / 5) + 32;
        }
        else{
            return (temp - 32) * 5 / 9;
        }
    }

    private void output() {
        String unit = unitPrompt();
        int temp = unit.equals("F") ? tempCPrompt() : tempFPrompt();
        String out = unit.equals("F") ? "The temperature in Fahrenheit is %d.\n" : "The temperature in Celsius is %d.\n";
        System.out.printf(out, calculations(unit, temp));
    }
}
