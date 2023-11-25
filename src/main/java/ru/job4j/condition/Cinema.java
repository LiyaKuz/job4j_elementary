package ru.job4j.condition;

public class Cinema {
    public static String access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            return "Welcome to the cinema.";
        } else {
            return "It is not for you.";
        }
    }

    public static void main(String[] args) {
        System.out.println(access(21));
        System.out.println(access(16));
    }
}