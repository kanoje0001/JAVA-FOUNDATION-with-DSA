package Questions;

import java.util.Scanner;

//a program to print the sum of negative numbers, sum of positive even numbers and the sum
// of positive odd numbers from a list of numbers (N) entered by the user. The list terminates
// when the user enters a zero.
public class KboatNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSum = 0;
        int eSum = 0;
        int oSum = 0;

        System.out.println("Enter the numbers :- ");
        while (true){
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }
            if (n<0){
                nSum += n;
            }
            else if (n%2 == 0)  {
                eSum +=n;
            }
            else {
                oSum += n;
            }
        }
        System.out.println("Negative No. Sum = " + nSum);
        System.out.println("Positive No. Even Sum = " + eSum);
        System.out.println("Positive No. Odd Sum = " + oSum);
    }
}
