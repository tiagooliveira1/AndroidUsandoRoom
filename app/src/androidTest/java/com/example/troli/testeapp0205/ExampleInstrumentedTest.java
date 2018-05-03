package com.example.troli.testeapp0205;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.troli.testeapp0205", appContext.getPackageName());
    }

    //@Test
    public void testRoom() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        AppDatabase app = AppDatabase.getDatabase(appContext);
        LembreteDAO lembreteDAO = app.lembreteDAO();

        lembreteDAO.deleteAll();

        Lembrete lembrete = new Lembrete();
        lembrete.setTexto("Lembrete de teste");
        /* testa inserção */
        assertEquals(1, lembreteDAO.inserir(lembrete) );
        List<Lembrete> lembretes = lembreteDAO.findAll();
        /* testa retorno de listagem */
        assertTrue(lembretes.size() > 0);
        /* testa o findBY */
        Lembrete resultado = lembreteDAO.findByID(1);
        assertNotNull(resultado);
        assertEquals(1, resultado.getID());

        lembrete.setImportancia(Importancia.Alta.ordinal());
        assertTrue(lembreteDAO.editar(resultado) > 0);

        assertTrue(lembreteDAO.excluir(resultado) > 0);

        lembreteDAO.excluir(resultado);

    }

    @Test
    public void teste_editaLembrete() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        AppDatabase app = AppDatabase.getDatabase(appContext);
        LembreteDAO lembreteDAO = app.lembreteDAO();

        Lembrete lembrete = lembreteDAO.findByID(2);

        lembrete.setTexto("TEXTO 123");

        lembrete.setImportancia(Importancia.Alta.ordinal());

        lembreteDAO.editar(lembrete);
    }
}
