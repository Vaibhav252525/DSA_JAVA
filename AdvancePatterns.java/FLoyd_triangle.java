public class FLoyd_triangle {
    public static void main(String[] args) {
        int i,j;
        int count=1;
        
        for(i=1;i<=6;i++){
            for(j=1;j<=i;j++){
                System.out.print(count+" ");
                
                count++;
            }
            System.out.println();
        }
    }
}
