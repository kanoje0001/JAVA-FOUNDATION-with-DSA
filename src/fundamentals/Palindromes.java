package fundamentals;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                int sum = 0;
                int n = sc.nextInt();
                int rem;
                int temp = n;

                while(n>0){
                    rem = n%10;
                    sum = ( sum * 10) + rem;
                    n = n/10;
                }
        if(temp==sum){
            System.out.println("it's palindrome");
        }
        else{
            System.out.println("it's not palindrome");
        }
    }
}
