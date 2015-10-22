package br.ufg.inf.p153;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author David
 */
public class TestePropriedade {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Prop153.p153(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Prop153.p153(5020);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Prop153.p153(1000);
    }
    
    @Test
    public void testCasos() {
        Assert.assertTrue(Prop153.p153(153));
        Assert.assertFalse(Prop153.p153(555));        
        Assert.assertTrue(Prop153.p153(0));       
    }   
}
