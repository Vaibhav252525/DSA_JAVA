// Java program to demonstrate working of Scanner in Java
import java.util.*;
public class TakingInput{
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        System.out.println(number);
        sc.close();

    }
}

