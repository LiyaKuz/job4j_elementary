package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
                for (int index = 1; index < data.length; index++) {
                    boolean reference = data[0];
                    if (data[index] != reference) {
                        result = false;
                    }
                }
        return result;
    }
}