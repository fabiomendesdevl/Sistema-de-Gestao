package com.pafsistemas.pafsistemas.controllers.Exceptions;

import java.util.NoSuchElementException;

public class ClientException extends RuntimeException {
    public ClientException(String message) {
        super(message);
    }
}
