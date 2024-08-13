public class Marks {
    public static void update(int marks[]) {
        int i;
        for (i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+1;
            System.out.println(marks[i]);
        }
            

    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        update(marks); 
        // for (int i = 0; i < marks.length; i++) {
        //     // System.out.println(marks[i]);
            
        // }
        System.out.println();
    }
}
