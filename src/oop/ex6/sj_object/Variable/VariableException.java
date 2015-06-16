package oop.ex6.sj_object.Variable;

import oop.ex6.main.Exceptions.BadSyntaxException;

/**
 * Created by GN3 on 6/16/15.
 */
public class VariableException extends BadSyntaxException {

    /* Data Members */
    /** String representations of exceptions*/
    private static final String UNINITIALIZED_VAR = "Use of uninitialized variable";
    private static final String EXISTING_NAME = "Declared a variable with an already existing name";
    private static final String FINAL_VAR = "Trying to change a final variable";
    private static final String UNINITIALIZED_FINAL = "Declared a final variable without assigning value";
    private static final String NO_SUCH_VAR = "Try to use a non existing variable";
    private static final String ILLEGAL_TYPE = "Declared a variable of illegal type";
    private static final String MISSING_TYPE = "Variable declaration is missing type";
    private static final String ILLEGAL_ASSIGNMENT = "Assigned value does not match variable type";

    /* Constructors */

    /** Empty Constructor*/
    public VariableException() {
        super();
    }

    /** Constructor including  error message*/
    public VariableException(String message) {
        super(message);
    }

    /** Constructor including error message and index*/
    public VariableException(String errorMessage, int lineIndex) {
        super(errorMessage, lineIndex);
    }

}
