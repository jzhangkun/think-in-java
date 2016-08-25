package exceptions;
import java.util.logging.*;
import java.io.*;
/**
 * Created by jack.zhang on 8/23/2016.
 */
public class LoggingException2 {
    private static Logger logger = Logger.getLogger("LoggingException2");
    static void LogException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch(NullPointerException e) {
            LogException(e);
        }
    }
}
