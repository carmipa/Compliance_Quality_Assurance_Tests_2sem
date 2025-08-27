package br.com.fiap.apdex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ApdexApplicationTests {

    @Test
    public void validaApdex() {
        // arrange

        Apdex apdex = new Apdex();

        /// act

        float result = apdex.calc(90, 10, 100);

        /// assert

        assertEquals(0.95, result, 0.01);


    }

}
