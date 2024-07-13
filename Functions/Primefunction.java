// import java.util.*;

import java.util.Scanner;

public class Primefunction {
    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        System.out.println(prime(n));
        sc.close();
    }
}