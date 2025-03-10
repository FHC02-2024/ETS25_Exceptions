package org.campus02.nummernraten;

public class NotANumberException extends Exception {

    public NotANumberException(String message) {
        super(message);
    }

    public NotANumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
