public class Palindrom_String {

    public static boolean palindrome(String s1)
    {
        String s2="";
        for(int i=0;i<s1.length();i++){
             s2= s2+s1.charAt(i);

            }
            System.out.println(s2);

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String s1="abba";
        
        boolean p=palindrome(s1);
        System.out.println(p);
        
    }

}
