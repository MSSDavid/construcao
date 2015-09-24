package br.com.david.div;

        import org.junit.Assert;
        import org.junit.Test;
        import static junit.framework.Assert.assertEquals;

public class TestDiv {

   
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Div.div(-1, 10, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Div.div(10, -1, 4);
    }
    
    //Má implementação impede que eu teste o código. :-( Que pena.
}