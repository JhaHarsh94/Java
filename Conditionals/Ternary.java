package Conditionals;
import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        String result = (n%2 == 0) ? "even" : "odd";
        System.out.println("The given no is" + result);
    }
}
