public class TryCatch {

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide(10, 2));
            System.out.println("Result: " + divide(10, 0));
            System.out.println("Result: " + divide(-10, 2));
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int divide(int a, int b) throws NegativeNumberException {
        if (a < 0 || b < 0) {
            throw new NegativeNumberException("Negative number are not allowed.");
        }
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
            return 0;
        }
    }
}

// 自定義例外類
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

