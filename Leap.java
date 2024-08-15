public class Leap {
    public static void main(String[] args) {
        // int n=1900;
        // if ((n%4==0 || n%400==0) && n%100!=0) {
        //     System.out.println("true");
        // }
        //     // else if (n%400==0) {
        //     //     System.out.println("true");
                
        //     // }
        //     else{
        //         System.out.println("false");
        //     }
            
        // }

        int n=12234;
        int count=0;
        while (n>0) {
            n=n/10;
            count++;
            
        }
        System.out.println(count);


    }
    }

