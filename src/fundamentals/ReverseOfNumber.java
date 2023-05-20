package fundamentals;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number:-");
        int n = Sc.nextInt();
        int x = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;

            x = (x * 10) + rem;
        }
        System.out.println(x);
    }
}