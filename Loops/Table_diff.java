package Loops;

public class Table_diff {
    public static void main(String[] args) {
        int n1 = 9, n2 = 4;
        for (int i = 1; i <= 10; i++) {
            int t1 = n1 * i;
            int t2 = n2 * i;
            int out = t1 - t2;
            System.out.print(out+" ");
        }
    }
}

