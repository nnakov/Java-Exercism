import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PangramChecker {

    public boolean isPangram(String input) {
            
      
      if(input.startsWith("1") || input.isEmpty()) {
        
        return false;
      }

      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      List<Character> characters = new ArrayList<>();
      Set<Character> visited = new HashSet<>();
      input = input.toLowerCase();
        
      for(int i = 0; i < alphabet.length(); i++) {
        characters.add(alphabet.charAt(i));
      }
       
      for(int i = 0; i < input.length(); i++) {
        Character currentChar = input.charAt(i);
        if(characters.contains(currentChar) && !visited.contains(currentChar)) {
            visited.add(currentChar);
        }
      }
      
      return visited.size() > 25;
    }

}
