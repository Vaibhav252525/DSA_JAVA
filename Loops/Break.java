package Loops;
import java.util.*;

public class Break {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("Enter the Number : ");
            int n= sc.nextInt();
        
            if (n % 10==0) {      // prints the number till user does not enters multiple of 10
                break;
                
            }
            System.out.println(n);
            
        }
        while (true);     
        sc.close();          

    }
}
