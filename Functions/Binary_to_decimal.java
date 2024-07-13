import java.util.Scanner;

public class Binary_to_decimal {
    public static void bin(int n) {
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));         
            pow++;
            n = n / 10;

        }
        System.out.println("decimal of " + n + " = "+ dec);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        bin(n);
        sc.close();

    }

}
