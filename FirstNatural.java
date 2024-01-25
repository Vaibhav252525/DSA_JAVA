import java.util.Scanner;

public class FirstNatural {

    public static int getsum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        System.out.println(getsum(n));
        sc.close();
    }
}
