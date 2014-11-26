package edu.upc.dsa.alfvarrom.beeter.api;

public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String detailMessage) {
        super(detailMessage);
    }
}
