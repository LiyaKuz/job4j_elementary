package ru.job4j.calculator;

public class Calculator { //class

    public static void plus(int first, int second) { //function + (function arguments)
        int result = first + second; //function body
        System.out.println(result); //function body
    }

    public static void minus(int first, int second) { //function + (function arguments)
        int result = first - second; //function body
        System.out.println(result); //function body
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
    }

}
