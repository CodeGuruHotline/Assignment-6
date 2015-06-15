package oop.ex6.sj_object;

/**
 * Created by GN3 on 6/15/15.
 */
/** Class to represent variable objects, which represent the variables encountered in the block*/
public class Variable {

    /* Data Members*/

    /** Variable Name*/
    String varName;

    /** Assign flag - flag for marking if the variable has been assigned a value.*/
    boolean assignFlag = false;

    /** Final flag - for marking if the variable has a Final Modifier*/
    boolean isFinal = false;

    /** Type - String to represent the variable type*/
    String varType;
}
