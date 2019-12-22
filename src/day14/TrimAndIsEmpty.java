package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message = "   Repl is coming ! ";

        System.out.println("message character count is: " + message.length());
        message = message.trim();
        System.out.println(message.trim());
        System.out.println("message character count is: " + message.length());

        System.out.println(message.isEmpty());

    }
}
