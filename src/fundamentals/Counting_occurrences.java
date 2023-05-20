package fundamentals;

import java.util.Scanner;

public class Counting_occurrences {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number:-");
        int n = Sc.nextInt();
        System.out.print("Enter the Counting Occurrences Number:-");
        int x = Sc.nextInt();
        int count = 0;

        while (n > 0){
            int rem = n%10;
            if (rem ==x) {
                count++;
            }
            n = n/10;

        }
        System.out.println(count);
    }
}
