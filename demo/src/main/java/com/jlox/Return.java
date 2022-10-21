package com.jlox;

class Return extends RuntimeException {
    final Object value;

    Return(Object value) {
        // disable some JVM machinery we don't need as we're using
        // this for control flow and not actual error handling :barf:
        super(null, null, false, false);
        this.value = value;
    }
}
