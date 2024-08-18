package Loggers;

import Interface.ILogger;
import Enum.LogType;

public class WarnLogger extends ILogger {
    public WarnLogger(ILogger logger) {
        this.nextLogger = logger;
        this.type = LogType.WARN;
    }

    @Override
    public void log(String type,String message) {
        if(type.equals(this.type.toString())) {
           System.out.println("Logging warning message: " + message);
        }
        else
           super.log(type, message);
    }
}
