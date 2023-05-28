package fundamentals;

public class StringReturn {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greeting = "Hey dost how's is going";
        return greeting;
    }
}
