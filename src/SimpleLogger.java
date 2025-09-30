import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public void logThis(String pMessage, String pLogLevel) {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        String logEntry = String.format("[%s] [%s] %s", timeStamp, pLogLevel, pMessage);
        System.out.println(logEntry);
    }
}
