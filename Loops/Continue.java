package Loops;

public class Continue {
    public static void main(String[] args) {
        int i=0;
        while (i<3) {
            i++;
            System.out.println("before " +i);
            
            if (i==2) 
            continue;
            System.out.println("after " +i);
            
        }
        
    }
}
