package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true) {
            System.out.print("Enter the Operator:- ");
            char Op = sc.next().trim().charAt(0);

            if (Op == '+' || Op == '-' || Op == '*' || Op == '%' || Op == '/') {
                System.out.print("Enter the two Number :- ");

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (Op == '*') {
                    ans = num1 * num2;
                }

                if (Op == '+') {
                    ans = num1 + num2;
                }

                if (Op == '-') {
                    ans = num1 - num2;
                }

                if (Op == '%') {
                    ans = num1 % num2;
                }

                if (Op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else if (Op == 'x' || Op == 'X') {
                    break;

                }

                }else {
                System.out.println("Invalid operation..!!");
                break;
            }

            System.out.println(ans);

        }


    }

}