public class Palindrome {
    public static boolean palin(String s) {
        int start=0;
        int end=s.length()-1;
        boolean ispal=true;
        while (start<end) {
            if (s.charAt(start)!=s.charAt(end)) {
                ispal=false;
                break;
            }
            start++;
            end--;
        }
        if (ispal==true) {
            // System.out.println("false");
            return true;
        }
        else{
            // System.out.println("true");
            return false;
        }
        
        
    }
    public static void main(String[] args) {
        String s="abAbba";
        // System.out.println(s);
        boolean s2=palin(s);
        System.out.println(s2);
        
    }
}
