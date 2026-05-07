public class LogLine {

    private String logLine;

    
    public LogLine(String logLine) {
        this.logLine = logLine;    
    }

    public LogLevel getLogLevel() {

        logLine = logLine.substring(1,4);
        
        switch(logLine) {
            case "TRC" -> {return LogLevel.TRACE;}
            case "DBG" -> {return LogLevel.DEBUG;}
            case "INF" -> {return LogLevel.INFO;}
            case "WRN" -> {return LogLevel.WARNING;}
            case "ERR" -> {return LogLevel.ERROR;}
            case "FTL" -> {return LogLevel.FATAL;}
            default -> {return LogLevel.UNKNOWN;}
        }
    }

    public String getOutputForShortLog() {

        String[] message = logLine.split(":");
        message[1] = message[1].trim();
        LogLevel code = getLogLevel();
        int number = code.getCode();

        return number + ":" + message[1];
    }
 
}
