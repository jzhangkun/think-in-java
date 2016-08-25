package exceptions.ex6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggeringException1");
    public LoggingException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class LoggingException2 extends Exception {
    private static Logger logger = Logger.getLogger("LoggeringException2");
    public LoggingException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch (Exception e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException2();
        } catch (Exception e) {
            System.err.println("Caught " + e);
        }
    }
}
