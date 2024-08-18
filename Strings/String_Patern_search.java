package Strings;

public class String_Patern_search {
    public static void main(String[] args) {
        String txt="abcd cdcdpdcda";
        String pat="cd";
        int pos= txt.indexOf(pat);
        // System.out.println(pos);
        
        while(pos>=0){
            System.out.print(pos+" ");
            pos= txt.indexOf(pat,pos+1);
            
        }
    }
}
