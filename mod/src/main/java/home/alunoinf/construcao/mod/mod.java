package home.alunoinf.construcao.mod;

public class mod
{
    public static int Mod (int x, int y) {
        if (x <= 0 || y < 0) {
            throw new IllegalArgumentException("Erro!");
        }
        int s = x;
        while (s >= y) {
            s = s - y;
        }
        return s;
    }

}
