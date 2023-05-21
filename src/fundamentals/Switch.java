package fundamentals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "apple":
                System.out.println("A sweet red fruit");
                break;

            case "mango":
                System.out.println("King of fruits");
                break;

            case "orange":
                System.out.println("A round fruit");
                break;

            case "grapes":
                System.out.println("small fruit");
                break;

            default:
                System.out.println("Please enter the valid fruit");
        }
    }
}

//
//            case "Apple" -> System.out.println("A sweet red fruit");
//                    case "Mango" -> System.out.println("King of fruits");
//                    case "Orange" -> System.out.println("A round fruit");
//                    case "Grapes" -> System.out.println("small fruit");
//default -> System.out.println("Please enter the valid fruit");
