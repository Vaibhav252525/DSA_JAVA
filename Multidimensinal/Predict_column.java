package Multidimensinal;

public class Predict_column {
    public static int predict(int array[][]) {

        int maxRow=0;
        int ans=0;
        for(int i=0;i<array.length;i++){
            int count =0;
            for(int j=0;j<array[i].length;j++){
                
                if(array[j][i]==0){
                    count++;
                }
                
            }           
           if(maxRow<count){
             maxRow=count;
            ans=i;
           }

           if(maxRow==array.length){
            break;
           }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int array[][]={{1,1,0},{1,1,0},{1,1,0}};
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
        int co=(predict(array));
        System.out.println(co);
        
    }
}
