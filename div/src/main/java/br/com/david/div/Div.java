package br.com.david.div;


public class Div {
    
    public static void div (int a, int b, int k) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Erro!");
        }
        int d = (a/b);
        System.out.println(d);
        int r = (a % b);
        if (r != 0) {
            System.out.println(",");
        }
        while (r != 0 || k > 0) {
            r = (10 * r);
            d = (r / b);
            System.out.println(d);
            r = (r / b);
            k = k - 1;
        }
        
    }
}
