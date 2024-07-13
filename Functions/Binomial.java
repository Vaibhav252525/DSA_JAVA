import java.util.Scanner;

public class Binomial {
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int bicofe(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int bicofe = fact_n / (fact_r * fact_nmr);
        return bicofe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(bicofe(n,r));
        sc.close();

    }
}