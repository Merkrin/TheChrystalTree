package ru.ibarciuc.exceptions;

/**
 * Custom exception class for all the errors related to name.
 */
public class NameException extends RuntimeException {
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }

    public NameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameException(Throwable cause) {
        super(cause);
    }
}
