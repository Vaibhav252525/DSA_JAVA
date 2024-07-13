import java.util.Scanner;

public class Primerange {
    public static boolean prime(int n) {
        if (n == 2) {
            return true;

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;

    }

    public static void range(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            if (prime(i)) {
                System.out.println(i);

            }

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        range(n);
        sc.close();

    }
}
