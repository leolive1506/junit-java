package org.example.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTest {
    @Test
    void validarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoNull() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Leonardo", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumeroDeTipoDiferente() {
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }
}