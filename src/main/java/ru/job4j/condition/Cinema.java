package ru.job4j.condition;

public class Cinema {
    public static String access(int age) {
        System.out.println("The age of the customer is : " + age);
        String result;
        if (age >= 18) {
            result = "Welcome to the cinema.";
        } else {
            result = "It is not for you.";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(access(21));
        System.out.println(access(16));
    }
}