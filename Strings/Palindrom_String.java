package Strings;

public class Palindrom_String {
    public static boolean isPalin(String s1){
        String rev= "";
        boolean result=false;
        for(int i=s1.length()-1;i>=0;i++){
            rev= rev+s1.charAt(i);

        }
        if (s1.equals(rev)) {
            return true;
        }
        return result;

        
        
        
    }
    public static void main(String[] args) {
        String s1="hello";
        s1= s1.toLowerCase();
        isPalin(s1);
    }

}
