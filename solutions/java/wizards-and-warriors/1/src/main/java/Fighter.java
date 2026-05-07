class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()) {
            return 10;
        }
        return 6;
    }
    
    public String toString() {
        return "Fighter is a Warrior";
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter {

    private boolean isSpellPrepared = false;
    
    @Override
    boolean isVulnerable() {
        if(isSpellPrepared) {
            return false;
        }
        return true;
    }

    @Override

    int getDamagePoints(Fighter fighter) {
        if(isSpellPrepared) {
            return 12;
        }
        return 3;
    }
    public void prepareSpell() {
        this.isSpellPrepared = true;
    }
    public String toString() {
        return "Fighter is a Wizard";
    }
}