package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "leonardo.santana")
    void validarAlgoSomenteUsuarioRoot() {
        Assertions.assertEquals(10, 10);
    }

    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoDiferenteUsuarioRoot() {
        Assertions.assertEquals(10, 10);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void enableOnMac() {
        Assertions.assertEquals(10, 10);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void enableOnLinux() {
        Assertions.assertEquals(10, 10);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarVersaoJava() {
        Assertions.assertEquals(10, 10);
    }
}
