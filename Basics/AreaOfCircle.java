package Basics;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println("Area of circle is : " + a);
    }
}
