package Loops;
import java.util.*;
public class PermutationAndCombination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int nfact = 1;
        for(int i=1; i<=n; i++){
            nfact = nfact*i;
        }
        System.out.println("The factorial of " + n + " is " + nfact);
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        int rfact = 1;
        for(int i=1; i<=r; i++){
            rfact = rfact *i;
        }
        System.out.println("The factorial of " + r + " is " + rfact);
        int nrfact = 1;
        for(int i=1; i<=n-r; i++){
            nrfact = nrfact*i;
        }
        System.out.println("The factorial of " + (n-r) + " is " + nrfact);
        int nCr = (nfact/(rfact * nrfact));
        System.out.println("The combination is : " + nCr);
    int nPr = (nfact/nrfact);
        System.out.println("The permutation is : " + nPr);
    }
}