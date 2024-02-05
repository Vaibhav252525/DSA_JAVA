import java.util.Scanner;

public class FindNthTerm {
    public static int nth_find(int a, int d, int n) {
        int ans = a + (n - 1) * d;
        return ans;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of A");// starting value of Array
        int a=  sc.nextInt();
        System.out.println("Enter value of D"); // Difference between two numbers in Array
        int d= sc.nextInt();
        System.out.println("Enter value of N"); // Nth Term which has to be find
        int n= sc.nextInt();
        System.out.println("Nth term is " +nth_find(a,d,n));
        sc.close();

    }
}
// program for printing nth position of an array
