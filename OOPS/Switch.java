package OOPS;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice= sc.nextInt();
        switch (choice) {
            case 1:
                double pi=3.14, r=5;
                double result= pi*r*r;
                System.out.println("area of circle is = "+result);

                break;
        
            case 2:
            int l=3,b=5;
            int rectangle = l*b;
            System.out.println("area of rectangle is = "+rectangle);
                break;
        }
        
    }
}
