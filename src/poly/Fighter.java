package poly;

// superclass or
// supertype
public class Fighter {

    protected int health;
    protected int strength;


    public void taunt() {
        System.out.println("You smell like durian.");
    }
    public void punch(Fighter poorBastard) {
        System.out.println("Pow for " + strength + " damage!");
        int tempHealth = poorBastard.health;
        poorBastard.setHealth(tempHealth - 7);
    }

    public Fighter() {
        health = 20;
        strength = 7;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "health=" + health +
                ", strength=" + strength +
                '}';
    }


    // accessors

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        // someone cant have negative health, so check for < 0
        if(health < 0) {
            health = 0;
        }
        this.health = health;
    }
}
