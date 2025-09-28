//PATTERN
/*  * * * * *
    * * * * *
    * * * * *
    * * * * *   */

package Pattern_Printing.RectangleAndSquare;
import java.util.*;
public class Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the no. of cols : ");
        int n = sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
