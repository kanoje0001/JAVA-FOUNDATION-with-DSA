package fundamentals;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        int a,b ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first Number :-");
        a = s.nextInt();
        System.out.print("Enter your Second Number :-");
        b = s.nextInt();

        int c = a+b;
        System.out.print("The sum of two number is :- " + c);


    }
}


//  s.nextDouble();
//  s.nextLong();
//  s.nextShort() ;

//    Scanner s = new Scanner(System.in);
//    String str = s.nextLine();
//        System.out.println(str);

//Scanner s = new Scanner(System.in);
//String str = s.next();
//char ch = str.charAt(0);
//System.out.print(ch);