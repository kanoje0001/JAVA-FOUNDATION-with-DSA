package fundamentals;

import java.util.Scanner;

public class Nested_Condition {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("ENTER TWO NUMBERS :- ");
        a = s.nextInt();
        b = s.nextInt();
// this conditions is Nested conditions
        if( a>b){
            System.out.println("First number is greater");
        }
        else {
            if( b>a ){
                System.out.println("Second number is greater");
            }else{
                System.out.println("Both are equal");
            }
        }

    }
}
