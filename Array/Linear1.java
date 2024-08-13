public class Linear1 {
    public static int fruit(String fruits[], String key) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(key)) { 
                return i;
            }        
        }
        return -1; 
    }

    public static void main(String[] args) {
        String fruits[] = {"mango", "apple", "banana"};
        String key = "apple"; 
        int index = fruit(fruits, key);
        if (index == -1) {
            System.out.println("not found");
        } 
        else {
            System.out.println("index at = " + index);
        }
    }
}
