import java.util.Scanner;

public class Circle {

public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the radius");
    double r= sc.nextDouble();
    double pi = 3.14, area;
    // calculating the area of the circle
    area = pi * r * r;
    // printing the area of the circle
    System.out.println("Area of circle is :" + area);
    sc.close();
}
}
