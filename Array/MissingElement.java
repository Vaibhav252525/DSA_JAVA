
public class MissingElement {
    public static void main(String[] args) {
        int arr[] = { 5,3,2,1};  
       
        
        int count=arr[0];
        
        for (int i = 0; i <arr.length; i++) {

            while (arr[i]!=count) {
                System.out.println(count);
                count++;  
            }
             count++;   
    
        }
    }

}
