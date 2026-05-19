import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
      
            
        List<String> translated = new ArrayList<>();

        if(rnaSequence.isEmpty()) {
            return translated;
        }

        Map<List<String>, String> codons = new HashMap<>();
        codons.put(List.of("AUG"),"Methionine");
        codons.put(List.of("UUU", "UUC"),"Phenylalanine");
        codons.put(List.of("UUA, UUG"),"Leucine");
        codons.put(List.of("UCU, UCC, UCA, UCG"),"Serine");
        codons.put(List.of("UAU, UAC"),"Tyrosine");
        codons.put(List.of("UGU, UGC"),"Cysteine");
        codons.put(List.of("UGG"),"Tryptophan");
       

        StringBuilder codon = new StringBuilder();
        int counter = 1;
        for(int i = 0; i < rnaSequence.length(); i++) {
            Character c = rnaSequence.charAt(i);
  
            codon.append(c);
           
            if(counter == 3) {
                
                if(codon.toString().equals("UAA") || codon.toString().equals("UAG") || codon.toString().equals("UGA")) {
                    return translated;
                }
                
                for(List<String> currentCodonList: codons.keySet()) {
                    for(String currentCodon: currentCodonList) {
                        if(currentCodon.contains(codon.toString())) {
                           
                            translated.add(codons.get(currentCodonList));
                        }
                    }
                }
                codon.setLength(0);
                counter = 0;
            }
            counter++;
        }
        
        if(rnaSequence.length() % 3 != 0 || translated.size() == 0) {
            throw new IllegalArgumentException("Invalid codon");
        }
        return translated;
    }
}
