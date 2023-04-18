//Question on square pattern in Number form
package Patterns;

import java.util.Scanner;

public class Square_Patterns {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Number :- ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 1;
        while(i<=n){
         int j = 1;
         while(j <= n){
             System.out.print(j);
             j = j+1;
         }
         System.out.println();
         i = i+1;
        }
    }

}
