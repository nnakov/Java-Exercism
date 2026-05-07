public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(":");
        
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        logLine = logLine.substring(1,8);
        String[] parts = logLine.split("\\]");
        
        return parts[0].toLowerCase();
    }

    public static String reformat(String logLine) {
        
        
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

}
