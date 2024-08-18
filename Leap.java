public class Leap {
    public static void main(String[] args) {
        int n=2100;
        if (n%400==0) {
            System.out.println("true");
        }
            else if (n%100==0) {
                System.out.println("false");
                
            }
            else if (n%4==0 ) {
                System.out.println("true");
                
            }
            else{
                System.out.println("false");
            }
            
        } 

    }
    

