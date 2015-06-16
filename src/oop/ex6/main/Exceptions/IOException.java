package oop.ex6.main.Exceptions;

/**
 * Created by GN3 on 6/16/15.
 */
public class IOException extends Exception {

    /* Data Members */
    private static final String NO_SUCH_FILE = "Trying to use a non existing file";
    private static final String FILE_IS_DIR = "Given file is a directory";
    private static final String BAD_FILE = "Couldn't read the given file - corrupt or not a text file";
    private String errorMessage;


    /* Constructors */
    /** Empty Constructor*/
    public IOException() {
        errorMessage = null;
    }

    /** Constructor including  error message*/
    public IOException(String message) {
        errorMessage = message;

    }

}
