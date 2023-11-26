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

}