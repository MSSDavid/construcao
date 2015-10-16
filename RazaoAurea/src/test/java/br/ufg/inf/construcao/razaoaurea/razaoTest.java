package br.ufg.inf.construcao.razaoaurea;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class razaoTest {
    
    @Test
    public void testPrimeiroParametro() throws Exception {
        Razao.aurea(0, 0, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametro() throws Exception {
        Razao.aurea(2, 1, 100);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametro() throws Exception {
        Razao.aurea(2, 3, 0);     
    }
    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(1.6180339, Razao.aurea(99, 100, 100), 0.0000001d);
    }
    
    
            
            
    
    
    
}
