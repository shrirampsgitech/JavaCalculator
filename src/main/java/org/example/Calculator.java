package org.example;

import java.util.Scanner;

public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("JAVA CALCULATOR");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add((int)a, (int)b));
                    break;

                case 2:
                    System.out.println("Result: " + calc.subtract((int)a, (int)b));
                    break;

                case 3:
                    System.out.println("Result: " + calc.multiply((int)a, (int)b));
                    break;

                case 4:
                    System.out.println("Result: " + calc.divide(a, b));
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}