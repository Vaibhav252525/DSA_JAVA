package Loops;

public class PF {
    public static boolean primecheck(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return false;

    }

    public static void factor(int n) {
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                // int x=i;
                if (primecheck(i))

                {
                    System.out.println(i);
                    // x=x*i;
                }
            }
        }
    }

    public static void main(String[] args) { 
        int n = 60;
        factor(n);
    }
}
