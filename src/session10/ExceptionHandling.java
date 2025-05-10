package session10;

public class ExceptionHandling {
    static int a = 10;
    static int b = 0;

    public static void main(String[] args) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
