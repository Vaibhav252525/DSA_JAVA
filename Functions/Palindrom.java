import java.util.Scanner;

public class Palindrom {
    public static void palindrom(int orgnum) {
        int rev=0;
        while (orgnum!=0) {
            
            int lastdigit=orgnum%10;
            rev= rev*10+lastdigit;
            orgnum=orgnum/10;
        }
        System.out.println(rev);
        if (orgnum==rev) {
        System.out.println("number is palindrome");
            
        }
        else{

            System.out.println("not plaindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int orgnum=sc.nextInt();
        palindrom(orgnum);
        sc.close();
    }
}
