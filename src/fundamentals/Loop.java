package fundamentals;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter your number :- ");
        n = s.nextInt();
        while (i<=n){
            System.out.println("Hey priyansh sir");
            i = i+1;
        }

    }

}
