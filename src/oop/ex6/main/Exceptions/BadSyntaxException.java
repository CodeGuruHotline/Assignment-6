package oop.ex6.main.Exceptions;

/**
 * Created by GN3 on 6/16/15.
 */
/** Super class for all syntax related exceptions*/
public abstract class BadSyntaxException extends Exception{

    /* Data Members */
    /** Starting index for line of error*/
    private final static int INITIAL_LINE = 0;

    /**String Description of the error*/
    String errorMessage;

    /** The line in which the error was encountered*/
    int lineIndex;

    /* Contructors */

    /** Empty Constructor*/
    public BadSyntaxException() {
        this(null, INITIAL_LINE);
    }

    /** Constructor including  error message*/
    public BadSyntaxException(String message) {
        this(message, INITIAL_LINE);

    }

    /** Constructor including error message and index*/
    public BadSyntaxException(String errorMessage, int lineIndex) {
        this.errorMessage = errorMessage;
        this.lineIndex = lineIndex;
    }
    @Override
    public String getMessage() {
        String message = errorMessage;
        if (errorMessage == null) {
            return null;
        }
        else if (lineIndex != INITIAL_LINE) {
            message += "in line "+lineIndex;
        }
        return message;
    }

}
