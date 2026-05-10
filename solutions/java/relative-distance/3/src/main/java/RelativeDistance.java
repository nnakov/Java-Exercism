import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.LinkedList;
import java.util.ArrayList;

class RelativeDistance {

    private Map<String, List<String>> familyTree = new HashMap<>();
    
    RelativeDistance(Map<String, List<String>>  familyTree) {
         this.familyTree = familyTree;
    }

    int degreeOfSeparation(String personA, String personB) {

       /*TASKS
        1. Add queue - DONE
        2. Add visited list - DONE
        3. Add distance - DONE
        4. Add graph - DONE
         */
        
        // Step 1 - Define auxiliary data structures
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> distance = new HashMap<>();
        Map<String, ArrayList<String>> graph = new HashMap<>();

        //Creat the connections
        for(String currentParent: familyTree.keySet()) { // Taking Parent = key
            graph.putIfAbsent(currentParent, new ArrayList<>()); // Parent, empty List
            for(int i = 0; i < 1; i++) {
                String firstChild = familyTree.get(currentParent).get(0); // Taking first child from List = value 
                graph.get(currentParent).add(firstChild); // Parent -> firstChild
                
                graph.putIfAbsent(firstChild, new ArrayList<>()); // Child, new empty list
                graph.get(firstChild).add(currentParent); // firstChild - > Parent
                if(familyTree.get(currentParent).size() > 1) {
                    String secondChild = familyTree.get(currentParent).get(1);
                    graph.get(currentParent).add(secondChild); // Parent -> firstChild, secondChild
                    graph.get(firstChild).add(secondChild); // firstChid -> Parent, secondChild
                    graph.putIfAbsent(secondChild, new ArrayList<>()); // secondChild -> new empty list
                    graph.get(secondChild).add(currentParent); // secondChild -> Parent
                    graph.get(secondChild).add(firstChild); // secondChild -> Parent, firstChild
                }
    
            }
        }
        
  
    

        // Step 2 - Define start point (person, distance = 0)
        queue.add(personA);
        visited.add(personA);
        distance.put(personA, 0);

        // Step 3 - define cycle to repeat
        while(!queue.isEmpty()) {
            String firstPerson = queue.poll();

            if(firstPerson.equals(personB)) {
                System.out.println(graph);
                return distance.get(firstPerson);
            }

           for(String neighbour: graph.get(firstPerson)) {
                //Step 4: Add the first person to queue, visited and distance if not yet visited
                if(!visited.contains(neighbour)) {
                    queue.add(neighbour);
                    visited.add(neighbour);
                        distance.put(neighbour, distance.get(firstPerson) + 1);
                }
            }
        }
        
        return -1; 
    
    }
}
