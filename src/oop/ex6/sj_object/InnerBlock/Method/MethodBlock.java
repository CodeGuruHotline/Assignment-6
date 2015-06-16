package oop.ex6.sj_object.InnerBlock.Method;

import oop.ex6.sj_object.InnerBlock.InnerBlock;
import oop.ex6.sj_object.SuperBlock;

import java.io.File;
import java.util.LinkedList;

/**
 * Created by GN3 on 6/14/15.
 */
// A Method block object to represent method blocks.
public class MethodBlock extends InnerBlock {

    /* Data Members */

    /** Linked list for storing the string representations of the methods signature*/
    LinkedList<String> methodSignature = new LinkedList<String>();

    /**
     * Return Flag - flag for marking if return exists in block*/
    private boolean returnFlag = false;

    /* Constructor */

    /** Class Constructor*/
    public MethodBlock(File sjfile, int startlineindex, SuperBlock parent,LinkedList<String> signature) {
        super(sjfile, startlineindex, parent);
        this.returnFlag = false;
        this.methodSignature = signature;
    }

    /* Methods */

    /**
     * Read's the current block's lines
     */
    @Override
    public void readBlockLines() throws Exception {

    }
    //Todo

    /**
     * Verifies if call signature matches the methods signature
     */
    public boolean isSignatureLegal() {
        return false;
    }
}
