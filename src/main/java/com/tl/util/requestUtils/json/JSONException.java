package com.tl.util.requestUtils.json;

public final class JSONException extends RuntimeException {
    public JSONException(final String message) {
        super(message);
    }

    public JSONException(final String message,final Throwable cause) {
        super(message, cause);
    }
}