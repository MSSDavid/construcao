package br.com.david.prop3025;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestProp {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroErrado() throws Exception {
        P3025.prop(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroErrado() throws Exception {
        P3025.prop(12000);
    }
    
    @Test
    public void testCasoVerdadeiro() {
       assertTrue(P3025.prop(0));
       assertTrue(P3025.prop(3025));       
    }
    
    @Test
    public void testCasoFalse() {
       assertFalse(P3025.prop(5622));
       assertFalse(P3025.prop(25));   
    }
    
}