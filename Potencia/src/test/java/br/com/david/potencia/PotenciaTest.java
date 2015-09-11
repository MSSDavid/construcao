
package br.com.david.potencia;

import org.junit.Assert;
import org.junit.Test;

public class PotenciaTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroErrado() throws Exception {
        Potencia.potencia(2, -6);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroErrado() throws Exception {
        Potencia.potencia(-1, 6);
    }
    
    @Test
    public void testCasoDeFronteira() {
       Assert.assertEquals(1, Potencia.potencia(1, 0));      
       Assert.assertEquals(2, Potencia.potencia(2, 1));      
       Assert.assertEquals(1, Potencia.potencia(5, 0));      
    }
    
    @Test
    public void testCasoTrivial() {
       Assert.assertEquals(27, Potencia.potencia(3, 3)); 
       Assert.assertEquals(100, Potencia.potencia(10, 2));
       Assert.assertEquals(380204032, Potencia.potencia(52, 5));
       Assert.assertEquals(1024, Potencia.potencia(2, 10));
    }
    
}