public class Buider_to_buffer {
    public static void main(String[] args) {
        StringBuilder sbr= new StringBuilder("hello");
        String sb= sbr.toString();
        StringBuffer sbl= new StringBuffer(sb);
        System.out.println(sbl);
    }
}
