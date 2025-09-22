//AP = 4, 7, 10, 13, 16,......,n
package Loops;
import java.util.*;
public class AP {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 4; i <= 3*n+1; i += 3){
            System.out.println(i);
        }
    }
}