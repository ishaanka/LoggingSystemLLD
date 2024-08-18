package Loggers;

import Interface.ILogger;
import Enum.LogType;

public class InfoLogger extends ILogger {
    public InfoLogger(ILogger logger) {
        this.nextLogger = logger;
        this.type = LogType.INFO;
    }

    @Override
    public void log(String type,String message) {
        if(type.equals(this.type.toString())) {
            System.out.println("Logging error message: " + message);
        }
        else
            super.log(type, message);
    }
}
