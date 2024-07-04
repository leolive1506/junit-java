package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioDeTranserencia() {
        var origem = "00000";
        var destino = "00001";

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferenciaEntreContas.transfere(origem, destino, -1);
        });

        Assertions.assertDoesNotThrow(() -> {
            transferenciaEntreContas.transfere(origem, destino, 1);
        });
    }
}
