package Patterns;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        n = s.nextInt();

        int i = 1;
        while( i <= n){
            int j = 1;
            while( j <= n) {
                System.out.print('*');
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }


    }

}
