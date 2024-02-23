import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class Switch {
    public static void main(String[] args) {
        int x=0, y=0;
        System.out.println("Enter move");
        Scanner sc= new Scanner(System.in);
        char Move = sc.next.charAt(0);
        switch (Move)
        {
            case 'L':
            x--;
            break;

            case 'R':
            x++;
            break;

            case 'D':
            y--;
            break;

            case 'U':
            y++;
            break;
        }
        Default:
        System.out.println("Invalid");

    }
}
