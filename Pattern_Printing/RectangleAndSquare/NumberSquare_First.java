//PATTERN
/*  1 2 3 4
    1 2 3 4
    1 2 3 4
    1 2 3 4
 */

package Pattern_Printing.RectangleAndSquare;
import java.util.*;
public class NumberSquare_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
