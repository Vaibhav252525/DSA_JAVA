

public class Reverse {
    public static void main(String[] args) {
        String s1="vaibhav";
        String s2="";
        int n= s1.length()-1;
        while (n>=0) {
          s2= s2+s1.charAt(n);
          n--;
          
        }
        System.out.println(s2);
    }
}
