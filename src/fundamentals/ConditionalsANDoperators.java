package fundamentals;

import java.util.Scanner;

public class ConditionalsANDoperators {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a,b;
        System.out.println("Enter two number :- ");
        a = s.nextInt();
        b = s.nextInt();

        if(a>0 && b>0){
            System.out.println("both are positive");
        }
        else {
            System.out.println("both are Not positive ");
        }

    }
}
