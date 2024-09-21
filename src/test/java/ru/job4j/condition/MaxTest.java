package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2147483647To2Then2147483647() {
        int left = 2147483647;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2147483647;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2147483647Then2147483647() {
        int left = 1;
        int right = 2147483647;
        int result = Max.max(left, right);
        int expected = 2147483647;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To5To6Then6() {
        int first = 4;
        int second = 5;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

}