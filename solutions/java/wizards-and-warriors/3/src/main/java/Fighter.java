class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


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

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

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

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}