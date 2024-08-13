public class LinearSearch {
    public static int linera(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
            return -1;
        
    }

    public static void main(String[] args) {
        int number[] = { 20, 10, 34, 56, 45 };
        int key = 10;
        int index = linera(number, key);
        if(index==-1){

            System.out.println("not found");
        }
        else{
            System.out.println("index position= "+index);
        }
    }
}
