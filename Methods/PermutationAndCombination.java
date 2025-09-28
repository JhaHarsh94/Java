package Methods;
import java.util.*;
public class PermutationAndCombination {
    public static int fact(int x){
        int f = 1;
        for(int i=1; i<=x; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        int nCr = fact(n)/(fact(r)*fact(n-r));
        System.out.println("the combination is : " + nCr);
        int nPr = fact(n)/fact(n-r);
        System.out.println("the permutation is : " + nPr);
    }
}