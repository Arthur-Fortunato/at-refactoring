package br.com.infnet.ex01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliacaoTest {
    @Test
    void deveRetornarCasoRaro() {
        assertEquals("CASO RARO", Avaliacao.avaliarNumero(-9999));
    }

    @Test
    void deveRetornarMedio() {
        assertEquals("MEDIO", Avaliacao.avaliarNumero(10));
    }

    @Test
    void deveRetornarAlto() {
        assertEquals("ALTO", Avaliacao.avaliarNumero(1000));
    }

    @Test
    void deveRetornarBaixo() {
        assertEquals("BAIXO", Avaliacao.avaliarNumero(0));
    }
}
