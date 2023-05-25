package Questions;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word:- ");
        String ch = sc.next();
        char c;
        for(int i=0; i<ch.length(); i++){
            c = ch.charAt(i);
            char ca = toLowerCase(c);
            if(ca=='a'||ca=='e'||ca=='i'||ca=='o'||ca=='u'){
                System.out.println( ca+" is vowel");
            }else {
                System.out.println(ca+" is consonant");
            }
        }

    }
}
