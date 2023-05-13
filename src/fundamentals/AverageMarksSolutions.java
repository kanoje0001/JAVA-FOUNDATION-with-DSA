package fundamentals;

import java.util.Scanner;

public class AverageMarksSolutions {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the charater :- ");
         char name = s.next().charAt(0);
         int m1,m2,m3;
         System.out.println("Enter 3 numbers :-");
         m1 = s.nextInt();
         m2 = s.nextInt();
         m3 = s.nextInt();
         int average = (m1+m2+m3)/3;
         System.out.print("The average of 3 numbers are :-");
         System.out.print(name);
         System.out.print(average);

    }
}

