package Interface;

import Enum.LogType;

public class ILogger {
    public ILogger nextLogger;
    public LogType type;

    public ILogger() {
        nextLogger = null;
        type = LogType.NONE;
    }
    public void log(String type, String message) {
        if (nextLogger != null) {
            nextLogger.log(type, message);
        }
    }
}
