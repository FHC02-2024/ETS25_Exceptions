package org.campus02.raumschiff;

public class TransporterMalfunctionException extends Exception {

    // zumindest ein Konstruktur für eine message
    public TransporterMalfunctionException(String message) {
        super(message);
    }

    // message + grund
    public TransporterMalfunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    // custom
    // message + status
    // status wäre noch zu definieren
    public TransporterMalfunctionException(String message, int status) {

    }
}
