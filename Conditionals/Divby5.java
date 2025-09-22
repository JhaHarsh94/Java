package Conditionals;

import java.util.Scanner;

public class Divby5 {
    public static void main(String[] args) {
        System.out.println("Enter the no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println("The given no. is divisible by 5");
        }
        else{
            System.out.println("The given no. is not divisible by 5 ");
        }
    }
}
