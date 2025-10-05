//PATTERN
/*  A A A A
    B B B
    C C
    D
 */
package Pattern_Printing.Triangles;
import java.util.*;
public class AlphabetTriangle_InvertedSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
