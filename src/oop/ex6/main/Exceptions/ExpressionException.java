package oop.ex6.main.Exceptions;

import oop.ex6.main.Exceptions.BadSyntaxException;

/**
 * Created by GN3 on 6/16/15.
 */
public class ExpressionException extends BadSyntaxException {

    /*Data Members*/
    /** String representations of exceptions*/
    public static final String NO_SEMICOLON = "Line is missing semicolon";
    public static final String CLOSING_BRACES = "Missing closing braces";
    public static final String INNER_METHOD_DECLARATION = "A method has been declared inside an existing " +
            "declaration";
    public static final String UNRECOGNIZED_EXPRESSION = "Encountered unsupported expression";
    public static final String ILLEGAL_NAME = "Encountered illegal name by s-java syntax";
    public static final String RESERVED_WORD = "Encountered usage of reserved word";

    /** Empty Constructor*/
    public ExpressionException() {
        super();
    }

    /** Constructor including  error message*/
    public ExpressionException(String message) {
        super(message);
    }

    /** Constructor including error message and index*/
    public ExpressionException(String errorMessage, int lineIndex) {
        super(errorMessage, lineIndex);
    }
}
