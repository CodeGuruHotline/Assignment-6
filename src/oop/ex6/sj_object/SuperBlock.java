package oop.ex6.sj_object;

import oop.ex6.sj_object.Variable.Variable;

import java.io.File;
import java.util.HashMap;

/**
 * Created by GN3 on 6/14/15.
 */
//Abstract super class - all block objects(global and regular) will extend this class.
public abstract class SuperBlock {

    /* Data Members*/

    /** Given S-Java code file*/
    File sJavaFile;

    /** Data member for storing block's hashtable*/
    protected HashMap<String, Variable> variableHashMap = new HashMap<String, Variable>();

    /** Global Block Reference for efficient access to existing methods*/
    protected SuperBlock globalBlock;

    /** Reference for this blocks parent block*/
    protected SuperBlock parentBlock;

    /* Methods*/

    /** Read's the current block's lines*/
    public abstract void readBlockLines() throws Exception;

    /** Gets the requested variable object*/
    protected Variable getVariable(String varName){
        return null;
    }

}
