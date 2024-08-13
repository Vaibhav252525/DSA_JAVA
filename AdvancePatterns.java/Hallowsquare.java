// package AdvancePatterns;

import java.util.Scanner;

public class Hallowsquare{
    public static void hallow(int row, int column) {
        int i,j;
        for(i=1;i<=row;i++){
            
            for(j=1;j<=column;j++){
                if (i==1||j==1||i==row||j==column) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
    
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        System.out.println("Enter number of columns");
        int column=sc.nextInt();
        hallow(row, column);
        sc.close();
        
    }

}
