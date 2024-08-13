public class SmallestArray {
    public static void smallest(int array[]) {
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if (smallest>array[i]) {
                smallest=array[i];
            }
        }
        System.out.println(smallest);
        
    }
    public static void main(String[] args) {
        int array[]={12,23,34,45,56};
        smallest(array);
    }
    
}
