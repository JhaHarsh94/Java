//GP = 1, 2, 4, 8, 16, 32, 64, ....n

package Loops;
import java.util.*;
public class GP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting value of the series");
        int a = sc.nextInt();
        System.out.println("Enter the nth term of the series");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(a);
            a = a*2;
        }
    }
}
