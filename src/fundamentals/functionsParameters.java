package fundamentals;

import java.util.Scanner;

public class functionsParameters {
    public static int sum(int num1 ,int num2){

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second Number : ");
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println("The sum is " + sum);

    }
}
