package home.alunoinf.construcao.mod;

        import org.junit.Assert;
        import org.junit.Test;


        import static junit.framework.Assert.assertEquals;

public class ModTest {

    /**
     *
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        mod.Mod(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        mod.Mod(10, -1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(0, mod.Mod(10, 10));
        Assert.assertEquals(1, mod.Mod(11, 2));
    }
}
