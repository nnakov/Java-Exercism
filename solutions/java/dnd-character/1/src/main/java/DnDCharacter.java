import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private List<Integer> constitution = rollDice();
    private List<Integer> strength = rollDice();
    private List<Integer> dexterity = rollDice();
    private List<Integer> intelligence = rollDice();
    private List<Integer> charisma = rollDice();
    private List<Integer> wisdom = rollDice();
    
    int ability(List<Integer> scores) {
        int smallest = scores.get(0);
        int sum = 0;
        for(int i = 0; i < scores.size(); i++) {
            if(smallest > scores.get(i)) {
                smallest = scores.get(i);
            }
            sum += scores.get(i);
        }
        return sum - smallest;
    }

    List<Integer> rollDice() {
        Random dice = new Random();
        List<Integer> rolls = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            int rollOne = dice.nextInt(1, 7);
            rolls.add(rollOne);
        }
        return rolls;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        int smallest = strength.get(0);
        int sum = 0;
        for(int i = 0; i < strength.size(); i++) {
            if(smallest > strength.get(i)) {
                smallest = strength.get(i);
            }
            sum += strength.get(i);
        }
        return sum - smallest;
    }

    int getDexterity() {
        int smallest = dexterity.get(0);
        int sum = 0;
        for(int i = 0; i < dexterity.size(); i++) {
            if(smallest > dexterity.get(i)) {
                smallest = dexterity.get(i);
            }
            sum += dexterity.get(i);
        }
        return sum - smallest;
    }

    int getConstitution() {
        int smallest = constitution.get(0);
        int sum = 0;
        for(int i = 0; i < constitution.size(); i++) {
            if(smallest > constitution.get(i)) {
                smallest = constitution.get(i);
            }
            sum += constitution.get(i);
        }
        return sum - smallest;
        
    }

    int getIntelligence() {
        int smallest = intelligence.get(0);
        int sum = 0;
        for(int i = 0; i < intelligence.size(); i++) {
            if(smallest > intelligence.get(i)) {
                smallest = intelligence.get(i);
            }
            sum += intelligence.get(i);
        }
        return sum - smallest;
    }

    int getWisdom() {
        int smallest = wisdom.get(0);
        int sum = 0;
        for(int i = 0; i < wisdom.size(); i++) {
            if(smallest > wisdom.get(i)) {
                smallest = wisdom.get(i);
            }
            sum += wisdom.get(i);
        }
        return sum - smallest;
    }

    int getCharisma() {
        int smallest = charisma.get(0);
        int sum = 0;
        for(int i = 0; i < charisma.size(); i++) {
            if(smallest > charisma.get(i)) {
                smallest = charisma.get(i);
            }
            sum += charisma.get(i);
        }
        return sum - smallest;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
