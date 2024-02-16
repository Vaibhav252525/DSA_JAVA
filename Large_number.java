public class Large_number {
    public static void main(String[] args) {
        int a = 100, b = 46, c = 67;
        if (a > b) {
            System.out.println("the large num is " + a);
            if (a > c)
                System.out.println("the large num is " + a);
            else
                System.out.println("the large num is " + c);
        } else if (b > c) {
            System.out.println("the large num is " + b);
        } else {
            System.out.println("the large num is " + c);
        }

    }
}


