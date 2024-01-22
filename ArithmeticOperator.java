public class ArithmeticOperator {
    public static void main(String[] args) {
        int x= 10 , y=30 ;
        System.out.println(x+y);
        System.out.println(x/y);
        System.out.println(x+y*y);
        int z= x++;
        System.out.println(z+ " " +x);
        z= ++x;
        System.out.println(z+ " " +x);
    }
}
