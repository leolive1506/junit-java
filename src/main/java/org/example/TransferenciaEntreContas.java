package org.example;

public class TransferenciaEntreContas {
    public void transfere(String contaOrigem, String contaDestino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }

}
