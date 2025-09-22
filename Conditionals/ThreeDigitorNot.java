package Conditionals;
import java.util.*;

public class ThreeDigitorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        if(n>99 && n<1000) {
            System.out.println(n + " is three digit no.");
        }
        else{
            System.out.println(n + " is not three digit no");
        }
    }
}
