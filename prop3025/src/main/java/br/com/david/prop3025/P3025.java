package br.com.david.prop3025;


public class P3025 {
    
    public static boolean prop (int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Erro!");
        }
        int i = n / 100;
        int j = n % 100;
        if ((i + j)*((i + j)) == n) {
            return true;
        } else {
            
            return false;
                    
        }
     
    }
        
}
