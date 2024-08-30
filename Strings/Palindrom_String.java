

public class Palindrom_String {
    public static boolean isPalin(String s1){
        s1= s1.toLowerCase();
        String rev= "";
        boolean result=false;
        for(int i=s1.length()-1;i>=0;i++){
            rev= rev+s1.charAt(i);

        }
        if (s1.equals(rev)) {
            result=true;
        }
        return result;

        
        
        
    }
    public static void main(String[] args) {
        String s1="hello";
        isPalin(s1);
    }

}
