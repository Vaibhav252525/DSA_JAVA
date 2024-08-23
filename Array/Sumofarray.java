import java.util.Scanner;

public class Sumofarray {
    public static void sum(int array[],int n) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=array[i]+sum;
        }
        System.out.println("Sum of array is ="+sum);

        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(array[i]);
        // }
        sum(array, n);
        sc.close();
    }
}
