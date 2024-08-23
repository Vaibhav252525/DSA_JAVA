package Practice;

public class Practice {
    public static void main(String[] args) {
        int n = 19;
        int d = 2;
        int result =(d - n) % 7;
        if (result < 0) {
            result = result + 7;
            
        }
        System.out.println(result);
    }

}
