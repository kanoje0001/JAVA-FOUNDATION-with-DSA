package Questions;

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;

        while (n>0)  {

            sum += n%10;
            product *= n%10;
            n /= 10;
        }

        System.out.println( product - sum);

    }
}
