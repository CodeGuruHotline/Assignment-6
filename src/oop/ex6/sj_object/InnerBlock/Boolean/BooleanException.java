package oop.ex6.sj_object.InnerBlock.Boolean;

import oop.ex6.main.Exceptions.BadSyntaxException;

/**
 * Created by GN3 on 6/16/15.
 */
public class BooleanException extends BadSyntaxException{

    /* Data Members */

    private static final String NON_BOOLEAN = "Expression inside parentheses is not boolean";
    private static final String MISSING_CONDITION = "Boolean block is missing condition";

    /* Constructors */

    /** Empty Constructor*/
    public BooleanException() {
        super();
    }

    /** Constructor including  error message*/
    public BooleanException(String message) {
        super(message);
    }

    /** Constructor including error message and index*/
    public BooleanException(String errorMessage, int lineIndex) {
        super(errorMessage, lineIndex);
    }

}
