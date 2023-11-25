package ru.job4j.condition;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class CinemaTest {

    @Test
    @DisplayName("Boundary value test")
    void when18ThenWelcomeText() {
        int in = 18;
        String expected = "Welcome to the cinema.";
        String out = Cinema.access(in);
        assertThat(out).isEqualTo(expected);
    }
}