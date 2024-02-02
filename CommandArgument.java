
public class CommandArgument {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("arguments are");
            for (String x : args)
                System.out.println(x + " ");

        } else
            System.out.println("no argument");

    }
}