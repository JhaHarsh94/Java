package Conditionals;
import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int mark = sc.nextInt();
        if(mark>=81 && mark<=100){
            System.out.println("Very Good");
        }
        else if (mark>=61 && mark<=80) {
            System.out.println("Good");
        }
        else if (mark>=41 && mark<=60) {
            System.out.println("Average");
        }
        else if (mark<=40) {
            System.out.println("Fail");
        }
    }
}
