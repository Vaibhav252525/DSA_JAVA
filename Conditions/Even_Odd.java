import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int x= sc.nextInt();
        if (x%2==0) {
            System.out.println("The Number is Even");
            
        }
        else{
            System.out.println("The Number is Odd");
        }
        sc.close();
    }
    
}
