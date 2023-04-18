package fundamentals;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for the string to be printed
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Getting user input for the number of times to repeat the string
        System.out.print("Enter the number of times to repeat the string: ");
        int numRepetitions = scanner.nextInt();

        // Printing the string in a loop based on the user's desired number of repetitions
        for (int i = 0; i < numRepetitions; i++) {
            System.out.println(inputString);
        }

        scanner.close();
    }
}
