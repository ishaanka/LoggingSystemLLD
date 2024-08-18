import Interface.ILogger;
import Loggers.ErrorLogger;
import Loggers.InfoLogger;
import Loggers.WarnLogger;

public class Main {
    public static void main(String[] args) {
        ILogger logger = new ErrorLogger(new WarnLogger(new InfoLogger(null)));

        logger.log("INFO","Dummy Message");
        logger.log("WARN","Dummy Message");
        logger.log("ERROR","Dummy Message");
    }
}