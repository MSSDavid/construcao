package br.ufg.inf.somas.snaturais;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class razaoTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Somas.naturais(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Somas.naturais(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Somas.naturais(-1);
    }
    
    @Test
    public void testCasos() {
        Assert.assertEquals(6, Somas.naturais(3));
        Assert.assertEquals(15, Somas.naturais(5));
        Assert.assertEquals(500500, Somas.naturais(1000));        
    }   
}
