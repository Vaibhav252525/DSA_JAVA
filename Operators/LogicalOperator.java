package Operators;
import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        String id="gfg", pass="GFG";
        Scanner sc= new Scanner(System.in);
        String iu = sc.next();
        String pwd = sc.next();
        if(id.equals(iu) && pass.equals(pwd))
        System.out.println("Welcome");
        else
        System.out.println("Try again");
        sc.close();
    }

}


    