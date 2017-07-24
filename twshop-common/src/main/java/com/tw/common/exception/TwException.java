package com.tw.common.exception;

/**
 * Created by tengw on 2017/7/24.
 */
public class TwException extends RuntimeException {

    private static final long serialVersionUID = 649333084513029673L;

    public TwException() {
    }

    public TwException(String message) {
        super(message);
    }

    public TwException(String message, Throwable cause) {
        super(message, cause);
    }

    public TwException(Throwable cause) {
        super(cause);
    }

    public TwException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
