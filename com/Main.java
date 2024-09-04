package com;

import com.Ar.Addition;
import com.Ar.Division;
import com.Ar.Multiplication;
import com.Ar.Subtraction;

public class Main {
    public static void main(String[] args) {
        // Create instances of the arithmetic classes
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        // Define two numbers for arithmetic operations
        int num1 = 10;
        int num2 = 2;

        // Perform and display the results of arithmetic operations
        System.out.println("Addition: " + addition.add(num1, num2));
        System.out.println("Subtraction: " + subtraction.subtract(num1, num2));
        System.out.println("Multiplication: " + multiplication.multiply(num1, num2));
        System.out.println("Division: " + division.divide(num1, num2));
    }
}
