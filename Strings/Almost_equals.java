

public class Almost_equals {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "madam";
       
        int a=0;
        int b=0;
        int deletecount=0;

        while(a<s1.length() && b<s2.length()){
            
            if(s1.charAt(a)!=s2.charAt(b)){
                deletecount++;
                a++;
            }else{
                a++;
                b++;
            }

        }

           
        while(a<s1.length()){
            deletecount++;
            a++;
        }

        while(b<s2.length()){
            deletecount++;
            b++;
        }

        System.out.println(deletecount);

        

    }
}
