package fundamentals;

import java.util.Scanner;

public class SumOf_N_number {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        n = s.nextInt();

        int i = 1;  // Next number to be added
        int sum = 0;
        while( i <= n){
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }

}
