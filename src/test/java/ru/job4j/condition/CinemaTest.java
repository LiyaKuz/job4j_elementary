package ru.job4j.condition;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class CinemaTest {

    @Test
    @DisplayName("Boundary value test")
    void when18ThenWelcomeText() {
        String expected = "Welcome to the cinema.";
        String out = Cinema.access(18);
        assertThat(out).isEqualTo(expected);
    }
}