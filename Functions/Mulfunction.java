import java.util.Scanner;

public class Mulfunction {
    public static int mil(int a,int b){
        int mul= a*b;
        return mul;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a= sc.nextInt();
        System.out.println("Enter value of b");
        int b= sc.nextInt();
        int mi= mil(a,b);
        System.out.println(mi);
        sc.close();
        
    }
}
