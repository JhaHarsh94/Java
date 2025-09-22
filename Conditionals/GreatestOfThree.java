package Conditionals;
import java.sql.SQLOutput;
import java.util.*;
public class GreatestOfThree {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number");
        int a = sc.nextInt();
        System.out.println("Enter the value of second number");
        int b = sc.nextInt();
        System.out.println("Enter the value of third number");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("First number is greatest");
        } else if (b>a && b>c) {
            System.out.println("Second number is greatest");
        }
        else {
            System.out.println("Third number is greatest");
        }
    }
}
