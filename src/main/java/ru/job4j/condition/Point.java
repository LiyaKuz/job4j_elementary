package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl1 = y2 - y1;
        double rsl2 = Math.pow(rsl, 2);
        double rsl3 = Math.pow(rsl1, 2);
        double rsl4 = rsl2 + rsl3;
        double rsl5 = Math.sqrt(rsl4);
        return rsl5;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(0, 0, 3, 0);
        System.out.println("result (0, 0) to (3, 0) " + result1);
        double result2 = Point.distance(0, 0, 4, 0);
        System.out.println("result (0, 0) to (4, 0) " + result2);
    }

}
