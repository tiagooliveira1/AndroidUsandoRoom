package com.example.troli.testeapp0205;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void text_isCorrect() throws Exception {
        String nome = "Pedro";
        assertEquals("Pedro", nome);
    }

    @Test
    public void objeto_nulo() throws Exception {
        Object teste = new Object();
        assertNotNull(teste);
    }

    @Test
    public void valor_verdadeiro() throws Exception {
        boolean teste = true;
        Teste objTeste = new Teste();
        assertFalse(objTeste.par(1533));
    }
}