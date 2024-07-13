import java.util.Scanner;

public class Decimaltobinary {
    public static void decimal(int n) {
        int bin = 0, rem = 0, pow = 0;
        while (n > 0) {

            rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("the decimal of " + n + " is "+bin);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        decimal(n);
        sc.close();
    }
}
