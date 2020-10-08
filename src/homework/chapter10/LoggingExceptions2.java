package homework.chapter10;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingException2");

    static void logException(Exception e) {
        StringWriter track = new StringWriter();
        e.printStackTrace(new PrintWriter(track));
        logger.severe(track.toString());
    }

    public static void main(String... args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
