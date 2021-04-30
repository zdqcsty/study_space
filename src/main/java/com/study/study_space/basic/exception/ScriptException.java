package com.study.study_space.basic.exception;


public class ScriptException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * (non-Javadoc)
     *
     * @see RuntimeException#RuntimeException()
     */
    public ScriptException() {
        super();
    }

    /**
     * (non-Javadoc)
     *
     * @param message
     *            异常信息
     * @see RuntimeException#RuntimeException(String)
     */
    public ScriptException(String message) {
        super(message);
    }

    /**
     * (non-Javadoc)
     *
     * @param cause
     *            异常对象
     * @see RuntimeException#RuntimeException(Throwable)
     */
    public ScriptException(Throwable cause) {
        super(cause);
    }

    /**
     * (non-Javadoc)
     *
     * @param message
     *            异常信息
     * @param cause
     *            异常对象
     * @see RuntimeException#RuntimeException(String, Throwable)
     */
    public ScriptException(String message, Throwable cause) {
        super(message, cause);
    }
}
