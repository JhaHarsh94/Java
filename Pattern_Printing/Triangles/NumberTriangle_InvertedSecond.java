//PATTERN
/*  4 4 4 4
    3 3 3
    2 2
    1
 */
package Pattern_Printing.Triangles;
import java.util.*;
public class NumberTriangle_InvertedSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
