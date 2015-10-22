package br.ufg.inf.somas.snaturais;

/**
 *
 * @author David
 * Se o N for menor que 1, haverá uma exceção.
 * 
 */
public class Somas {
    
    public static int naturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n");
        }
        
        int i = 2;
        int s = 1;
        
        while (i <= n) {
            s = s + i;
            i = i + 1;
        }
        
        return s;
    }   
}
