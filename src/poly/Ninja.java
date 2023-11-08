package poly;

// subclass or
// subtype
public class Ninja extends Fighter {

    private int numShuriken;

    @Override
    public void taunt() {
        super.taunt();
        System.out.println("You stinky bastard.");
    }

    public Ninja() {
        strength = 5;
        numShuriken = 5;
    }

    public void throwShuriken(Fighter poorBastard) {
        // a ninja can throw up to 3 shuriken, but not more than the initial 5 total
        int tempHealth = poorBastard.health;
        for (int i = 0; i < 3; i++) {
            if (numShuriken == 0){
                break;
            }
            System.out.println("Zing");
            tempHealth -= 3;
            numShuriken --;
        }
        poorBastard.setHealth(tempHealth);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "numShuriken=" + numShuriken +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
