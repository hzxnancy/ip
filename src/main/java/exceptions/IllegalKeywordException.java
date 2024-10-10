package exceptions;

/** Handles errors when the user gives an invalid keyword.*/
public class IllegalKeywordException extends Exception {
    public IllegalKeywordException(String message) {
        super(message);
    }
}
