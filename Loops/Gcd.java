package Loops;
//Greatest Common Divisor

public class Gcd {
    public static void main(String[] args) {
        int a=10, b=15;
        int r=Math.min(a, b);
        int ans=1;

        for(int i=1;i<=r;i++){
            if (a%i==0 && b%i==0) {
                ans=i;
            }
        }
        System.out.println(ans);           
    }
}
