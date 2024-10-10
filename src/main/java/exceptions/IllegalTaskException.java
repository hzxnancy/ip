package exceptions;

/** Handles errors when the user gives an invalid task. */
public class IllegalTaskException extends Exception {
    public IllegalTaskException(String message) {
        super(message);
    }
}