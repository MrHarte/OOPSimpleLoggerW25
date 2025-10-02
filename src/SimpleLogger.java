import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static SimpleLogger aLogger = null;

    private SimpleLogger() {

    }

    public static SimpleLogger getInstance() {
        if (aLogger == null) {
            aLogger = new SimpleLogger();
        }
        return aLogger;
    }

    public void logThis(String pMessage, String pLogLevel) {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        String logEntry = String.format("[%s] [%s] %s", timeStamp, pLogLevel, pMessage);
        System.out.println(logEntry);
    }
}
