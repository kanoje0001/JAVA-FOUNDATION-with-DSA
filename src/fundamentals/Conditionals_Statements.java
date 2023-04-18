package fundamentals;

import java.util.Scanner;

public class Conditionals_Statements  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();

        if( a>b ) {
            System.out.println("First number us greater");
        }
        else{
            System.out.println("Second number is greater");
        }

        System.out.println("Outside if else");

    }

}
