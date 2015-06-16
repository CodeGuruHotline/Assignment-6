package oop.ex6.sj_object.InnerBlock.Method;

import oop.ex6.main.Exceptions.BadSyntaxException;

/**
 * Created by GN3 on 6/16/15.
 */
public class MethodException extends BadSyntaxException {

    /* Data Members */
    public final String NO_RETURN_STATEMENT = "Method is missing return statement";
    public final String NO_RETURN_TYPE = "Illegal return type in method declaration";
    public final String ILL_RETURN_TYPE = "Illegal return type in method declaration";
    public final String UNMATCHING_SIGNATURE = "Calling method with un-matching signature";
    public final String SIGNATURE_DECLARATION = "Illegal signature in method declaration";
    public final String NON_EX_METHOD = "Trying to call a nonexisting method";



}
