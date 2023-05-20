package fundamentals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet:- ");
        char ch = sc.next().trim().charAt(0);

        if (ch>= 'a' && ch <='z') {

            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Case");
        }

    }

}