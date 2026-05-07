import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    
    String transcribe(String dnaStrand) {
        
         if(dnaStrand.length() == 0) {
             return "";
         }
        
         Map<String, String> rna = new HashMap<>() {{
            put("G", "C");
            put("C", "G");
            put("T", "A");
            put("A", "U");
        }};

        if(dnaStrand.length() > 1) {
            StringBuilder longRna = new StringBuilder();
            for(int i = 0; i < dnaStrand.length(); i++) {
                char s = dnaStrand.charAt(i);
                longRna.append(rna.get(String.valueOf(s)));
            }
            return longRna.toString();
        }
        return rna.get(dnaStrand);
    }

}
