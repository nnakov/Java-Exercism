import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    
    String transcribe(String dnaStrand) {
        
         
        if(dnaStrand.isEmpty()) {
            return "";
        }
        Map<Character, Character> rna = Map.of(
            'G', 'C',
            'C', 'G',
            'T', 'A',
            'A', 'U'
        ); 
            
        StringBuilder resultRna = new StringBuilder();
        for(int i = 0; i < dnaStrand.length(); i++) {
            resultRna.append(rna.get(dnaStrand.charAt(i)));
        }
            
        return resultRna.toString();
    }

}
