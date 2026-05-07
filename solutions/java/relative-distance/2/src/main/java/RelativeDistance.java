import java.util.List;
import java.util.Map;
import java.util.HashMap;

class RelativeDistance {

    private Map<String, List<String>> familyTree = new HashMap<>();
    
    RelativeDistance(Map<String, List<String>>  familyTree) {
         this.familyTree = familyTree;
    }

    int degreeOfSeparation(String personA, String personB) {
           int cycle = 0;
           int changeA = 0;
           int changeB = 0;
           int result = 0;
           String currentParentA = personA;
           String currentParentB = personB;
        //Check for key or List 
        if(familyTree.get(personA) != null) {

            //Check for parent relationship
            if(familyTree.get(personA).contains(personB)) {
                return 1;
            }

            //Check two degree of separation, grandchild
            if(familyTree.get(personB) == null) {
                List parent = familyTree.get(personA);
                
                if(familyTree.get(parent.get(0)).contains(personB)) {
                    return 2;
                }
            }

            //Check Unrelated individuals
            if(familyTree.containsKey(personA) && familyTree.containsKey(personB)) {
                while(cycle < 10) {
                
                for(String parent: familyTree.keySet()) {
                    if(familyTree.get(parent).contains(currentParentA)) {
                        
                        currentParentA = parent;
                        changeA++;
                    }
                    if(familyTree.get(parent).contains(currentParentB)) {
                        
                        currentParentB = parent;
                        changeB++;
                    }
                    if(currentParentA.equals(currentParentB)) {
                        result = changeA + changeB - 1;
                        return result;
                    }
                    
                }
                cycle++;              
            }   
                return -1;
            }  
        } else {

            //Check for siblings
            for(List siblings: familyTree.values()) {
                if(siblings.contains(personA) && siblings.contains(personB)) {
                    return 1;
                }
            }
            
            while(cycle < 10) {
                
                for(String parent: familyTree.keySet()) {
                    if(familyTree.get(parent).contains(currentParentA)) {
                        
                        currentParentA = parent;
                        changeA++;
                    }
                    if(familyTree.get(parent).contains(currentParentB)) {
                        
                        currentParentB = parent;
                        changeB++;
                    }
                    if(currentParentA.equals(currentParentB)) {
                        result = changeA + changeB - 1;
                        return result;
                    }
                    
                }
                cycle++;              
            }   
            
        }
    
        return 0;
    }
}
