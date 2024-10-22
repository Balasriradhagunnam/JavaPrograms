public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        // Handling ArithmeticException (Division by zero)
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        }

        // Handling ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Accessing out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index is out of range.");
        }

        // Handling NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // Null reference
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call method on a null object.");
        }
    }
}

// Output
//   Caught ArithmeticException: Division by zero is not allowed.
//   Caught ArrayIndexOutOfBoundsException: Index is out of range.
//   Caught NullPointerException: Cannot call method on a null object.
