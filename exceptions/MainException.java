package exceptions;

import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/26/16
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        // Open the file
        FileInputStream file = new FileInputStream("MainException.java");
        file.close();
    }
}
