import java.io.*;
import java.io.BufferedReader;

public class Buferred {
    public static void main(String[] args) 
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = br.readLine();
        System.out.println("your string is " +s);
    }
}
