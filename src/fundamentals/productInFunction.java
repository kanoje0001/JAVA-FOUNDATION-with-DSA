package fundamentals;

import java.util.Scanner;

public class productInFunction {

    public static int product(int num1,int num2){
        int product = num1 * num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        System.out.println("Product of two number is  " + product(a,b));
    }
}
