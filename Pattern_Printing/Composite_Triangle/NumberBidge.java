//PATTERN
/*  1 2 3 4 5 6 7
    1 2 3   5 6 7
    1 2       6 7
    1           7
 */
package Pattern_Printing.Composite_Triangle;
import java.util.*;
public class NumberBidge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j+" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("  ");
            }
            for (int j = 2*i+n; j <= 2 * n + 1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
