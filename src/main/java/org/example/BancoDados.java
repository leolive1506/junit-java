package org.example;

import java.util.logging.Logger;

public class BancoDados {
    private static Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static  void iniciarConexecao() {
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexecao() {
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("Remove dados");
    }
}
