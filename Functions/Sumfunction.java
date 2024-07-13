import java.util.Scanner;

public class  Sumfunction{
    public static void sumoftwo(int n1, int n2){
        int sum=n1+n2;
        System.out.println("Sum of two number is: "+sum);
        

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sumoftwo(a,b);
        sc.close();


    }
}