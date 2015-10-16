package br.ufg.inf.construcao.razaoaurea;

/**
 *
 * @author David
 * Algoritmo que implementa a razão áurea
 * 15/10/2015
 */
public class Razao {

    public static float aurea(float t1, float t2, float fator) {
        if (t1 <= 0) {
            throw new IllegalArgumentException("t1");
        }
        
        if (t2 <= t1) {
            throw new IllegalArgumentException("t2");
        }        
        
        if (fator <= 0) {
            throw new IllegalArgumentException("fator");
        }   
        
        float tc = t2;
        float ta = t1;
        int i = 1;
        while (i <= fator) {
            tc = tc + ta;
            ta = tc - ta;
            i = i + 1;
        }
        
        return (tc / ta);
    }
}
