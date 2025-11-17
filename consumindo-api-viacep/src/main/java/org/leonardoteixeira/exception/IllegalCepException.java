package org.leonardoteixeira.exception;

public class IllegalCepException extends RuntimeException {
    private String mensagem;

    public IllegalCepException(String message) {
        this.mensagem = message;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
