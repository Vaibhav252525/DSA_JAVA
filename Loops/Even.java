import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        int number;
        int choice;
        do{
            System.out.println("Enter the number");
            number=sc.nextInt();
            if(number%2==0){
            evensum+=number;
            }
            else{
                oddsum+=number;
            }
            System.out.println("do you want to continue if yes prees 1 or 0 for no");
            choice= sc.nextInt();
        }
        while(choice==1);
            System.out.println("the sum of even number is "+evensum);
            System.out.println("the sum of odd number is "+oddsum);
            sc.close();

    }
}





