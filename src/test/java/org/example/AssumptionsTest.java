package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarAlgoSomentoNoUsuarioRoot() {
        System.out.println(System.getenv("USER"));
        Assumptions.assumeTrue("leonardo.santana".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 10);
    }
}
