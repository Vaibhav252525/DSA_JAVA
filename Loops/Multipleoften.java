import java.util.Scanner;

public class Multipleoften {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
            sc.close();
        }
        while(true);
    }
}
