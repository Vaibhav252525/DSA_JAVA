import java.util.Scanner;

public class Sc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");// entering string value
        String s= sc.nextLine();
        System.out.println("enter the string "+s);
        System.out.println("enter the integer");// entering Integer value
        Integer i= sc.nextInt();
        System.out.println("enter the integer "+i);
        System.out.println("enter the Float"); // entering FLoat value
        Float f= sc.nextFloat();
        System.out.println("enter the Float "+f);
        sc.close();
    }
}
