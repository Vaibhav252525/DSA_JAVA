public class Naturalsum {
    public static void main(String[] args) {
        int val = 1, sum = 0, n = 2;
        while (val <= n) {

            sum = sum + val;
            val = val + 1;
        }
        System.out.println("sum of natural num is = " + sum);

    }

}
