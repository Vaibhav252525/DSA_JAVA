public class Count_distinct {
    
    public static void distinct(int arr[]) {
        int count=0;     
        for(int i =0;i<arr.length;i++){

            for(int j=0;j<=i;j++){

                if(i==j){
                    count++;
                }
                
                if(arr[i]==arr[j]){
                    break;
                }
                
            }
            
        }
        System.out.println(count);
       
    }

    public static void main(String[] args) {
        int array[]={10,20,30,20,40};
        distinct(array);

    }
}
