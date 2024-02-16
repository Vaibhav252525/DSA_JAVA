import java.util.Scanner;

public class Nest_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        if (n < 0) {
            System.out.println("Negative number");
            if (n % 2 == 0) 
                System.out.println("Negative Even");
           else
            System.out.println("Negative odd");

        } 
        else if (n > 0) {
            System.out.println("Positive Number");
        
        if (n % 2 == 0) 
            System.out.println("Positive Even");

        else 
            System.out.println("Positive odd");
        }
        
        else{
            System.out.println("zero");
        }
        sc.close();

    }
}

// program to print positive or negative even or odd number else it will print 0

