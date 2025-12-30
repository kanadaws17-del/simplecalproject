package com.myproject;

/**
 * Simple Calculator for CI/CD Demo
 */
public class Calculator {

    /**
     * Adds two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second number from first
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides first number by second
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    /**
     * Main method to demonstrate calculator
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Simple Calculator Demo ===");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));
        System.out.println("==============================");
        System.out.println("Calculator is working correctly!");
    }
}
