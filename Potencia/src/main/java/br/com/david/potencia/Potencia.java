
package br.com.david.potencia;


public class Potencia {
    public static int potencia(int x, int y) {
        if ( x < 0 || y < 0) {
            throw new IllegalArgumentException("Algo deu errado.");
        }
        
        int i = 1;
        int p = 1;
        
        while ( i <= y ) {
            p = p * x;
            i = i + 1;
        }
        return p;
    }
    
}
