

public class Count_vovels {
    public static void main(String[] args) {
        String s = "a  iueotmnsw";
        int vovel = 0;
        int consonent = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                vovel++;
                
            }else if(s.charAt(i)!=' '){
                consonent++;
            }
        }
        System.out.println(vovel);
        System.out.println(consonent);
        int count1=vovel;
        int count2=consonent;
        if (count1 > count2)
            System.out.println("Yes");
        else if (count1 == count2) {
            System.out.println("Same");
        }
        else{
            System.out.println("No");
        }

    }
}
