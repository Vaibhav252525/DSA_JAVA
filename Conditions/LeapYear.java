
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int L= sc.nextInt();
        if (L%4==0 && L%400==0) {
            System.out.println("its a Leap Year");
            
        }
        else{
        System.out.println("its not leap year");}
        sc.close();

    }
}
