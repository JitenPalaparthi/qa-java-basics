import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;

public class BahaviouralDemo{

    public static void main(String[] args) {
        // build an immutable chain of responsibility
        Logger logger = Logger.consoleLogger(Logger.LogLevel.all())
                .appendNext(Logger.emailLogger(Logger.LogLevel.FUNCTIONAL_MESSAGE, Logger.LogLevel.FUNCTIONAL_ERROR))
                .appendNext(Logger.fileLogger(Logger.LogLevel.WARNING, Logger.LogLevel.ERROR));

        // Handled by consoleLogger since the console has a LogLevel of all
        logger.message("Entering function ProcessOrder().", Logger.LogLevel.DEBUG);
        logger.message("Order record retrieved.", Logger.LogLevel.INFO);

        // Handled by consoleLogger and emailLogger since emailLogger implements Functional_Error & Functional_Error
        logger.message("Unable to Process Order ORD1 Dated D1 For Customer C1.", Logger.LogLevel.FUNCTIONAL_ERROR);
        logger.message("Order Dispatched.", Logger.LogLevel.FUNCTIONAL_MESSAGE);

        // Handled by consoleLogger and fileLogger since fileLogger implements Warning & Error
        logger.message("Customer Address details missing in Branch DataBase.", Logger.LogLevel.WARNING);
        logger.message("Customer Address details missing in Organization DataBase.", Logger.LogLevel.ERROR);
    }
}

@FunctionalInterface
interface Logger {
    public enum LogLevel {
        INFO, DEBUG, WARNING, ERROR, FUNCTIONAL_MESSAGE, FUNCTIONAL_ERROR;

        public static LogLevel[] all() {
            return values();
        }
    }

    abstract void message(String msg, LogLevel severity);

    default Logger appendNext(Logger nextLogger) {
        return (msg, severity) -> {
            message(msg, severity);
            nextLogger.message(msg, severity);
        };
    }
    static Logger writeLogger(LogLevel[] levels, Consumer<String> stringConsumer) {
        EnumSet<LogLevel> set = EnumSet.copyOf(Arrays.asList(levels));
        return (msg, severity) -> {
            if (set.contains(severity)) {
                stringConsumer.accept(msg);
            }
        };
    }

    static Logger consoleLogger(LogLevel... levels) {
        return writeLogger(levels, msg -> System.err.println("Writing to console: " + msg));
    }

    static Logger emailLogger(LogLevel... levels) {
        return writeLogger(levels, msg -> System.err.println("Sending via email: " + msg));
    }

    static Logger fileLogger(LogLevel... levels) {
        return writeLogger(levels, msg -> System.err.println("Writing to Log File: " + msg));
    }
    
}
