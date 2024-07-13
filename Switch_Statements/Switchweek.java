import java.util.Scanner;

public class Switchweek {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        switch (number) {
            case 1:
            System.out.println("Sunday");
                
                break;

                case 2:
                System.out.println("Monday");
                break;
        
            default:
            System.out.println("you have given wrong input");
                break;
        }
        sc.close();
    }
}
