package Loops;

import java.util.*;

public class Continue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("enter value of x:");
            int x = sc.nextInt();
            System.out.println("enter value of y:");
            int y = sc.nextInt();
            if (y == 0)
                continue;
            System.out.println(x / y);
            sc.close();
        }
    }

}
