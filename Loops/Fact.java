package Loops;
public class Fact {
    public static void main(String[] args) {
        int ans=1,n=10;

        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        System.out.println(ans);
    }
}
