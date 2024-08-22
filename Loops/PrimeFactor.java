package Loops;

public class PrimeFactor {
    public static boolean prim(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void factor(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prim(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i+" ");
                    x = x * i;
                }

            }

        }

    }

    public static void main(String[] args) {
        int n = 20;
        factor(n);

    }
}
