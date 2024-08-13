public class Pair {
    public static void pairofArray(int array[]) {
        for(int i=0;i<array.length;i++){
            int curr =array[i];
           for(int j=i+1; j<array.length;j++){
            

               System.out.print("("+curr+","+array[j]+")");
           }
           System.out.println();

        }
        
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        pairofArray(array);
        
    }
}
