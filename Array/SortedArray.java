public class SortedArray {
    public static boolean sorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5,20, 30, 40 };
        System.out.print(sorted(arr));
        
    }
}
