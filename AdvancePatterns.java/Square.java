public class Square {
    public static void main(String[] args) {

        int s = 5;

        for (int i = 1; i <= s; i++) {
            if (i == 1 || i == s) {

                for (int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }

            } else {
                for (int j = 1; j <= s; j++) {
                    if (j == 1 || j == s) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }

            System.out.println();
        }

    }
}
