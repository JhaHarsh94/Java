//PATTERN
/*  A A A
    B B B
    C C C   */
package Pattern_Printing.RectangleAndSquare;
import java.util.*;
public class AlphabetSquare_Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }
}
