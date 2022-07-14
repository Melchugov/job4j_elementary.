package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumSum(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {

        System.out.println("Результат sum и Multiply " + sumAndMultiply(10, 20));
        System.out.println("Результат subtraction и Division " + subtractionAndDivision(10, 20));
        System.out.println("Результат sum, Multiply, subtraction и Division " + sumSum(10, 20));
    }
}