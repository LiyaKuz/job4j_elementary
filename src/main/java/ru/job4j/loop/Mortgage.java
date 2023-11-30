package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        for (double index = amount; index > 0; year += 1) {
            index += (index * (percent / 100)) - salary;
        }
        return year;
    }
}