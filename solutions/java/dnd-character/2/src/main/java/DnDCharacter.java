import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private int constitution = ability(rollDice());
    private int strength = ability(rollDice());
    private int dexterity = ability(rollDice());
    private int intelligence = ability(rollDice());
    private int charisma = ability(rollDice());
    private int wisdom = ability(rollDice());
    
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
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
        
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
