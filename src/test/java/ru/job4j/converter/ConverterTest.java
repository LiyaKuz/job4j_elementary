package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert150RblThen2dot1428Euro() {
        float in = 150;
        float expected = 2.1428F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert0RblThen0Euro() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToEuro(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenConvertMinus70RblThenMinus1Euro() {
        float in = -70;
        float expected = -1;
        float out = Converter.rubleToEuro(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenConvert200RblThen3dot3333Dlr() {
        float in = 200;
        float expected = 3.3333F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert0RblThen0Dlr() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenConvertMinus60RblThenMinus1Dlr() {
        float in = -60;
        float expected = -1;
        float out = Converter.rubleToDollar(in);
        assertThat(out).isEqualTo(expected);
    }
}