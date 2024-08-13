public class LargestnumArray {
    public static int get(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }

        }
        return largest;
    }
    
    public static void main(String[] args) {
        int array[] = { 10, 12, 45, 34, 78, 90 };
        System.out.println("largest array number is = "+get(array));      

    }

}
