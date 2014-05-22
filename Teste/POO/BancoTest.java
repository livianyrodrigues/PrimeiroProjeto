

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BancoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BancoTest
{
    /**
     * Default constructor for test class BancoTest
     */
    public BancoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void bancoAgencia()
    {
        Banco banco1 = new Banco();
        banco1.setNome("BB");
        banco1.setNumero(1);
        Agencia agencia1 = new Agencia();
        agencia1.setNumero(111);
        banco1.cadastrarAgencia(agencia1);
        assertEquals(agencia1, banco1.pesquisarAgenciaPorNumero(111));
    }
}

