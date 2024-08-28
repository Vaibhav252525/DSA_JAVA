package Loops;

public class Lcm {
    public static void main(String[] args) {
        int a=50,b=10;
        int x= Math.max(a, b);
        int y=a*b;
        int ans=x;
        for(int i=x;i<=y;i++){
            if (i%a==0 && i%b==0) {
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
