package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTest {
    @BeforeAll
    static void configurarConexao() {
        BancoDados.iniciarConexecao();
    }

    @BeforeEach
    void insereDadosParaTest() {
        BancoDados.insereDados(new Pessoa("Joao", LocalDateTime.now()));
    }

    @AfterEach
    void removeDadosTest() {
        BancoDados.removeDados(new Pessoa("Joao", LocalDateTime.now()));
    }

    @Test
    void validarDadosRetorno() {
        System.out.println("Test: validarDadosRetorno");
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2() {
        System.out.println("Test: validarDadosRetorno2");
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDados.finalizarConexecao();
    }
}
