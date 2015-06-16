package oop.ex6.sj_object;

import oop.ex6.sj_object.InnerBlock.Method.MethodBlock;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by GN3 on 6/14/15.
 */
// A block object to represent the global block
public class GlobalBlock extends SuperBlock{




    /*Data Members*/
    /** Scanner for parsing the given file*/
    Scanner myScanner;

    /** Hashmap for storing encountered methods*/
    HashMap<String, MethodBlock> methodBlockHashMap = new HashMap<String, MethodBlock>();



    /** Class Constructor*/
    public GlobalBlock(File sJavaFile) {
        this.parentBlock = null;
        this.sJavaFile = sJavaFile;
        this.globalBlock = this;
    }
    /* Methods*/

    /** Read's the current block's lines*/
    @Override
    public void readBlockLines() throws Exception {
        //Call gather methods
    }

//    private void createScanner(){
//        try {
//            myScanner = new Scanner(sJavaFile);
//        }catch{
//    }


    /** Parses  the given s-java file and detects existing methods*/
    private void gatherMethods(){
        //Call create scanner

        }
    }


