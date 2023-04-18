package fundamentals;

import java.util.Scanner;

public class CharacterCase_nested {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        char result;
        if (Character.isUpperCase(ch)) {
            result = Character.toLowerCase(ch);
        } else {
            result = Character.toUpperCase(ch);
        }

        System.out.println("Original character: " + ch);
        System.out.println("Modified character: " + result);
    }
}

