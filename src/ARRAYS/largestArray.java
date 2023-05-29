package ARRAYS;

import java.util.Scanner;

public class largestArray {
    public static int getlargest(int[] numbers){
        int largest = Integer.MIN_VALUE; // infinity

        for (int number : numbers) {
            if (largest < number) {
                largest = number;

            }

        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=in.nextInt();
        int i = 0;
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        array[i]= in.nextInt();
        System.out.println("The largest number in array is " + getlargest(array));
    }
}
