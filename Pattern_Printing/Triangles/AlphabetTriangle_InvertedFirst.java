//PATTERN
/*  A B C D
    A B C
    A B
    A
 */
package Pattern_Printing.Triangles;
import java.util.*;
public class AlphabetTriangle_InvertedFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
