import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.LogRecord;

public class ThreadLogger {
    private final Logger logger;

    ThreadLogger(Class<?> clazz) {
        this.logger = Logger.getLogger(clazz.getName());

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("[%s] [%s] %s%n",
                        Thread.currentThread().getName(),
                        record.getLevel(),
                        record.getMessage());
            }
        });

        logger.addHandler(handler);
        logger.setUseParentHandlers(false); // Disable parent handlers
    }

    // Factory method to create logger for a specific class
    public static ThreadLogger getLogger(Class<?> clazz) {
        return new ThreadLogger(clazz);
    }

    // Logging methods
    public void info(String message) {
        logger.info(message);
    }

    public void warn(String message) {
        logger.log(Level.WARNING, message);
    }

    public void error(String message) {
        logger.log(Level.SEVERE, message);
    }

    public void debug(String message) {
        logger.log(Level.FINE, message);
    }
}
