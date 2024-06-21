package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente() {
        var pessoa = new Pessoa("Leonardo", LocalDateTime.of(2004, 6, 25, 00, 00));
        Assertions.assertEquals(19, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeMaiorIdade() {
        var pessoa = new Pessoa("Leonardo", LocalDateTime.of(2004, 6, 25, 00, 00));
        Assertions.assertTrue(pessoa.maiorDeIdade());

        pessoa = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(pessoa.maiorDeIdade());
    }

}
