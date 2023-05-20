package fundamentals;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int b = sc.nextInt();
        System.out.print("Enter third Number:- ");
        int c = sc.nextInt();

        //@ :- find the largest of three number.

        int max = a;

        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }

        System.out.println(max);
    }

}
