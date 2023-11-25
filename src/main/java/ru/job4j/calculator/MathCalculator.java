package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDividing(double first, double second) {
        return subtract(first, second)
                + dividing(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета метода sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subtractAndDividing равен: " + subtractAndDividing(10, 20));
        System.out.println("Результат расчета sumOfAllOperations равен: " + sumOfAllOperations(10, 20));
    }
}
