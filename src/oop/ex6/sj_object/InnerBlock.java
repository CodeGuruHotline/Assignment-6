package oop.ex6.sj_object;

import java.io.File;

/**
 * Created by GN3 on 6/15/15.
 */
public abstract class InnerBlock extends SuperBlock{

    /*Data Members*/

    /** Field to represent the index of the first line of this block*/
    int startLineIndex;

    /**Class Constructor*/
    public InnerBlock(File sjfile, int startlineindex, SuperBlock parent) {
        this.parentBlock = parent;
        this.globalBlock = parent.globalBlock;
        this.startLineIndex = startlineindex;
        this.sJavaFile = sjfile;
    }

    /*Methods*/

    //Todo
    /** Returns Method block object - for efficient access to existing methods*/
    protected MethodBlock getMethod(String methodName){
        return null;
    }


}
