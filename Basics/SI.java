package Basics;
import java.util.Scanner;
public class SI {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest");
        double r = sc.nextDouble();
        System.out.println("Enter time period");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("SI = " + si);
    }
}
