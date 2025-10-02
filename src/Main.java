public class Main {
    public static void main(String[] args) {
        SimpleLogger logger = SimpleLogger.getInstance();
        logger.logThis("Message for the log file.", "Info");
    }
}