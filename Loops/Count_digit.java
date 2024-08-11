package Loops;
public class Count_digit {
    public static void main(String[] args) {
        int n=123, count=0;
        while (n>0) {
             n= n/10;
             count=count+1;
             
            }
            System.out.println("count of digit = "+count);
    }
}
