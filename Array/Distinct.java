
public class Distinct {
    public static void distinct(int arr[]) {     
        for(int i =0;i<arr.length;i++){

            for(int j=0;j<=i;j++){

                if(i==j){
                    System.out.println(arr[i]);
                    break;
                }

                if(arr[i]==arr[j]){
                    break;
                }

            }

        }
       
    }

    public static void main(String[] args) {
        int array[]={10,20,30,20};
        distinct(array);

    }
}