package org.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemTest {
    @Test
    @Order(4)
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Test
    @Order(3)
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Test
    @Order(2)
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Test
    @Order(1)
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
