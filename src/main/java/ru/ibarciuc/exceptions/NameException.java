package ru.ibarciuc.exceptions;

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
