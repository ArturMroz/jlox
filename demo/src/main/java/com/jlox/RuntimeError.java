package com.jlox;

class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String msg) {
        super(msg);
        this.token = token;
    }
}
