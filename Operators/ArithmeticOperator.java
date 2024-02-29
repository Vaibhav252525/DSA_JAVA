package Operators;
public class ArithmeticOperator {
    public static void main(String[] args) {
        int x= 10 , y=30 ;
        System.out.println(x+y);
        System.out.println(x/y);
        System.out.println(x+y*y);
        int z= x++;
        System.out.println(z+ " " +x);
        z= ++y;
        System.out.println(z+ " " +y);
    }
}

// z= x++ first value of x will get assign to the z i.e 10 then get incremented by 1 which will be 11
// z= y++ here, first value of y will get incremented which will be 31 and this value will get assign to the z 