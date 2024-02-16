import java.util.*;
public class If_else {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        Integer n= sc.nextInt();
        if (n<0) {
            System.out.println("Please Enter valid Number");
            
        }
        System.out.println("Sum of first Natural number is " +n*(n+1)/2); //prints Sum of first Natural number without using else condition
        sc.close();

    }
}
