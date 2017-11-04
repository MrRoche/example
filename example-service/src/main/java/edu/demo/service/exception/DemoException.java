package edu.demo.service.exception;

public class DemoException extends RuntimeException{

    public DemoException(String message){
        super(message);
    }

    public DemoException(Throwable cause){
        super(cause);
    }

    public DemoException(String message, Throwable cause){
        super(message, cause);
    }
}
