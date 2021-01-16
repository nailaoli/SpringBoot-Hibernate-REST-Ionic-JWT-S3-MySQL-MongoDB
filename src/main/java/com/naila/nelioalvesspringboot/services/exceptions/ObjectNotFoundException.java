package com.naila.nelioalvesspringboot.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUid = 1L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
