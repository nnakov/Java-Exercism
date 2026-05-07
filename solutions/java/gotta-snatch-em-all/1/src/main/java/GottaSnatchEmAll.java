import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {
    
    static Set<String> newCollection(List<String> cards) {
  
        Set<String> setCards = new HashSet<>();
        for(String card: cards) {
            setCards.add(card);
        }
        return setCards;
    }

    static boolean addCard(String card, Set<String> collection) {
        if(collection.contains(card)) {
            return false;
        }
        collection.add(card);
        return true;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }
        if(myCollection.containsAll(theirCollection)) {
            return false;
        }
        if(myCollection.size() != theirCollection.size()) {
            return false;
        }
        return true;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        
        Set<String> sameCards = new HashSet<>(collections.get(0));

        for(Set<String> collect: collections) {
            sameCards.retainAll(collect);
        }
        
        return sameCards;

    }

    static Set<String> allCards(List<Set<String>> collections) {

        Set<String> combinedCards = new HashSet<>();

        for(Set<String> collection: collections) {
            combinedCards.addAll(collection);
        } 
        return combinedCards;
    }
}
