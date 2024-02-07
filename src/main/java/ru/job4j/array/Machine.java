package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] result = new int[100];
        money -= price;

        for (int coin : coins) {
            while (money >= coin) {
                money -= coin;
                result[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}