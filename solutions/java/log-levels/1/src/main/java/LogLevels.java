public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(":");
        
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String finalLog = "";

        for(int i = 0; i < logLine.length(); i++) {
            char current = logLine.charAt(i);
                if(current == ']') {
                    break;
                }
                if(!(current == '[')) {
                    finalLog += current;
                }
           
        }
    
        return finalLog.toLowerCase();
    }

    public static String reformat(String logLine) {
        
        String part0 = "";
        for(int i = 0; i < logLine.length(); i++) {
            char current = logLine.charAt(i);
                if(current == ':') {
                    break;
                }
                if(current == '[') {
                    current = '(';
                }
                if(current == ']') {
                    current = ')';
                }
                current = Character.toLowerCase(current);
                part0 += current;
                
        }
        
        String[] parts = logLine.split(":");
        String finalLine = parts[1].trim() + " " + part0;
        return finalLine;
    }

}
