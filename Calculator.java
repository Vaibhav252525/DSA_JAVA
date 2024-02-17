import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Operation\n a.addition\n 2.substraction\n 3.Multiplication");
        int Operation = sc.nextInt();
        if (Operation != 1 && Operation != 2 && Operation != 3) {
            System.out.println("Invalid");
        } 
        else {
            System.out.println("Enter First Number:");
            int a = sc.nextInt();
            System.out.println("Enter Second Number:");
            int b = sc.nextInt();
        
        if (Operation == 1) {
            System.out.println(a + b);

        } 
        else if (Operation == 2) {
            System.out.println(a - b);

        } 
        else if (Operation == 3) {
            System.out.println(a * b);

        }
        sc.close();

    }
}
}
