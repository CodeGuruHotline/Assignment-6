package oop.ex6.sj_object;

import java.io.File;
import java.util.HashMap;

/**
 * Created by GN3 on 6/14/15.
 */
// A block object to represent the global block
public class GlobalBlock extends SuperBlock{

    /** Class Constructor*/
    public GlobalBlock(File sJavaFile) {
        this.parentBlock = null;
        this.sJavaFile = sJavaFile;
        this.globalBlock = this;
    }


    /*Data Members*/

    /** Hashmap for storing encountered methods*/
    HashMap<String, MethodBlock> methodBlockHashMap = new HashMap<String, MethodBlock>();

    /* Methods*/

    /** Read's the current block's lines*/
    @Override
    public void readBlockLines() throws Exception {

    }

}
