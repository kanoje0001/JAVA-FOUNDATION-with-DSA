package fundamentals;

import java.util.Scanner;

public class CurrencyConvetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rupees:- ");
       float rupees = sc.nextLong();
       float dollar = rupees/82;
        System.out.println(dollar + " Dollars ");

    }
}
