package org.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdemTest {
    @Test
    @DisplayName("B")
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("A")
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("C")
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("D")
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
