import java.util.Scanner;

public class Fact_function {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact= fact*i;          
        }
        return fact;
        // System.out.println(fact);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int nw=fact(n);
        System.out.println(nw);
        sc.close();

        
    }
    
}
