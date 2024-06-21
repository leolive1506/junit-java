package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void validarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoNull() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Leonardo", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumeroDeTipoDiferente() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
