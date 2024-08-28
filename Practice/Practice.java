package Practice;

public class Practice {
   public static int main(int n) {
      
      if (n==1) {
         return 1;
      }
      if (n==2) {
         return 1;
      }
      int first=1;
      int second=1;
      for(int i=3;i<=n;i++){
         int ans=first+second;
         first=second;
         second=ans;
      }
      return second;
      
   }
   public static void main(String[] args) {
      int n=10;
      int result=main(n);
      System.out.println(result);
      
   }
}