public class Main {
    public static void main(String[] args) {
        SimpleLogger logger = SimpleLogger.getInstance();
        SimpleLogger logger2 = SimpleLogger.getInstance();
        logger.logThis("Hello", "Info");
    }
}