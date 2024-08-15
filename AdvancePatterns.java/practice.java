public class practice {
    public static void main(String[] args) {
        int i,j;
        for( i=1;i<=4;i++){
            for( j=4;j>=i;j--){
                int row=4,col=4;
                if (i==1 || j==1 || i==row || j==col) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
