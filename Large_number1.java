import java.util.Scanner;

public class Large_number1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int ans_1 = Math.max(a, b);
        int ans = Math.max(ans_1, c);
        System.out.println("The Largest Number is"+ans);
        sc.close();
    }
}
    

