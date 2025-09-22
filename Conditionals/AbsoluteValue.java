package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String args[]){
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println(-n);
        }
        else{
            System.out.println(n);
        }
    }
}
