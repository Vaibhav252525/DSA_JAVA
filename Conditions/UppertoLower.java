
public class UppertoLower {
    public static void main(String args[]) {
        char ch1 ='P';
        if(ch1>='a' && ch1<='z'){
            System.out.println((char)(ch1-'a'+'A')); // converts into upparcase
        }
        else{
            System.out.println((char)(ch1-'A'+'a')); // converts into lowercase
        }
        
    }
}
