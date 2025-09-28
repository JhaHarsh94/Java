package Methods;
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value : ");
        int a = sc.nextInt();
        System.out.println("Enter the second value : ");
        int b = sc.nextInt();
        System.out.println("Enter the third value : ");
        int c = sc.nextInt();
        System.out.println("The maximum value is : " + Math.max(Math.max(a,b),c));
    }
}
