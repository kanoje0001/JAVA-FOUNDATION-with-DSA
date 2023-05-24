package Questions;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class userInputMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num, ans=0;


         do{
            System.out.print("Enter the number:- ");
            num = sc.nextInt();
            System.out.println("Enter 0 to end the loop");
            if(num>max){
                max=num;
            }
        }while(num>0);


        System.out.println("the number is " + max);

    }
}
