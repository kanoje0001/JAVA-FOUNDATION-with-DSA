package Questions;

import java.util.Scanner;

public class IsPrime {

    public static boolean isprime(int n){
        boolean isprime = true;
        for (int i =2 ; i<=n-1; i++ ){
            if (n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int prime = sc.nextInt();
        System.out.println(isprime(prime));
    }
}
