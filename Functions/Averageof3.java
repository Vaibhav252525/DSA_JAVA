import java.util.Scanner;

public class Averageof3 {
    public static void Average(int a,int b, int c) {
        int result=a+b+c;
        result=result/3;
        System.out.println("Average of three num is "+result);
        
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 number");
        int a=sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();
        System.out.println("Enter 3 number");
        int c=sc.nextInt();
        Average(a,b,c);
        sc.close();
    }
}