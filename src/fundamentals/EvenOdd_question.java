package fundamentals;

import java.util.Scanner;

public class EvenOdd_question  {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("ENTER YOUR NUMBER :- ");
        a = s.nextInt();
        int rem = a%2;
        boolean result = rem == 0;
        if (result){
            System.out.println(a + " is EVEN");
        }
        else{
            System.out.println(a + " is ODD");
        }

    }
}
