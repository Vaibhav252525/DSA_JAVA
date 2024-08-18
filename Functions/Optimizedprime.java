import java.util.Scanner;

public class Optimizedprime {
    public static boolean prime(int n) {
        if (n == 2) {
            return true;

        }
        if (n == 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println(prime(n));
        sc.close();
    }
}
