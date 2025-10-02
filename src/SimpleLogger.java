import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String LOG_FILE = "application.log";

    public void logThis(String pMessage, String pLogLevel) {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        String logEntry = String.format("[%s] [%s] %s\n", timeStamp, pLogLevel, pMessage);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write(logEntry);
        } catch (IOException e) {
            // If logging fails, print to console as a fallback
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }
}
