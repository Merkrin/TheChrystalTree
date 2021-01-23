package ru.ibarciuc.exceptions;

public class ParentsException extends RuntimeException {
    public ParentsException() {
        super();
    }

    public ParentsException(String message) {
        super(message);
    }

    public ParentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParentsException(Throwable cause) {
        super(cause);
    }
}
