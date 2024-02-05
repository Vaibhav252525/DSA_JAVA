import java.util.Scanner;

public class GeometricProgression {
    public static int nth_term(int a,int r,int n) {
        int ans= a*(int)(Math.pow(r, n-1));
        return ans;    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int r= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(nth_term(a,r,n));
        sc.close();
    }
    
}

// program for printing nth position of an array