package fundamentals;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int fac = 1;
        for (int i = 1 ; i <= n ; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = in.nextInt();
        System.out.println("the factorial is " + factorial(a));

    }
}
