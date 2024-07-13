import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        char c= sc.next().charAt(0);
        switch(c){
            case 'g':
            System.out.println("burder");
            break;
            case 'B':
            System.out.println("samosa");
            break;
            default:
            System.out.println("anything");

        sc.close();

        }

    }

    
}
