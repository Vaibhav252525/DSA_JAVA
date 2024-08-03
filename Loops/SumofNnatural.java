package Loops;
import java.util.*;
public class SumofNnatural {
    public static void main(String[] args) {
        int n=5,sum=0,val=1;
        while (val<=n) {
            sum=sum+val;
            val=val+1;           
        }
        System.out.println("Sum of first %n natural number is " +sum);
    }
    
}
