public class In{


    public static void main(String[] args) {
        
        int n =5;


        for(int i =n;i>=1;i--){

            for(int s=i;s>1;s--){
                System.out.print(" ");
            }

            for(int j=n;j>i-1;j--){
                System.out.print("*");

            }

            System.out.println();
        }

    }
}