package org.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrdemTest {
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
