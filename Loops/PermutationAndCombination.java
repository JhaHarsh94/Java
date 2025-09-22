package Loops;
import java.util.*;
public class PermutationAndCombination{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 0; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + fact);
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        for (int i = 0; i <= r; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + r + fact);
        System.out.println("The combination is " + (n/(n*(n-r))));
        System.out.println("The permutation is " + (n/(n-r)));
    }
}