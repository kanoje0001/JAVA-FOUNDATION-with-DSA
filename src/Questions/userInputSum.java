//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package Questions;

import java.util.Scanner;

public class userInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Enter the number:- ");
            num = sc.nextInt();
            System.out.println("Enter 0 to end the loop");
            sum += num;
        }
        while (num>0);
        System.out.println("the number is " + sum);

    }
}
