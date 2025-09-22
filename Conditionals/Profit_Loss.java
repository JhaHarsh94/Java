package Conditionals;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price :");
        int cp = sc.nextInt();
        System.out.println("Enter selling price:");
        int sp = sc.nextInt();
        if(cp<sp){
            System.out.println("The profit is :"+(sp-cp));
        }
        else if (sp < cp) {
            System.out.println("The loss is :"+(cp-sp));
        }
        else if(sp == cp){
            System.out.println("No loss, no profit");
        }
    }
}
