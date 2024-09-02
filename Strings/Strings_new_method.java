public class Strings_new_method {
    public static void main(String[] args) {
        StringBuilder sbr= new StringBuilder("coder ");
        // sbr.reverse();
        // System.out.println(sbr);
        // sbr.append("for life");
        // System.out.println(sbr);
        // sbr.setCharAt(4, 's');
        // System.out.println(sbr);
        // sbr.deleteCharAt(4);
        // System.out.println(sbr);

        sbr.replace(0, 5, "moder");
        System.out.println(sbr);

    }
}
