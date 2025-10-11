//PATTERN
/*  1
    1 3
    1 3 5
    1 3 5 7
 */
package Pattern_Printing.Special_Pattern;
import java.util.*;
public class Odd_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num = num+2;
            }
            System.out.println();
        }
    }
}
