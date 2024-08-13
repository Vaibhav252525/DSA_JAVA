public class Findavg {
    public static void main(String[] args) {
        int array[]={10,20,30};
        int sum=0;
            for(int i=0;i<array.length;i++){
                sum=sum+array[i];
            }
            System.out.println("sum of array is ="+sum);
            
            int avg=sum/array.length;
            System.out.println(avg);
        
    }
}
