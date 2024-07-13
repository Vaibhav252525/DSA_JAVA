import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        int tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        if (income < 500000) {
            tax = 0;
            // System.out.println(tax);

        } else if (income >= 150000) {
            tax = income * 20 / 100;
            // System.out.println(tax);

        } else {
            tax = income * 30 / 100;
        }
        System.out.println(tax);
        sc.close();

    }

}
