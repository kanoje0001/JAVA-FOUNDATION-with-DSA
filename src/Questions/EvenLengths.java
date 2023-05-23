package Questions;

import java.util.Scanner;

public class EvenLengths {

        public static void printWords(String input_string) {
            System.out.println("\nThe words with even lengths are: ");
            for (String word : input_string.split(" "))
                if (word.length() % 2 == 0)
                    System.out.println(word);
        }
        public static void main(String[] args) {
            String input_string = "Java Programming are cool";
            System.out.println("The string is defined as: " +input_string);
            printWords(input_string);
        }

}
