package poly;

public class PolyLec {
    public static void main(String[] args) {
        // make a fighter class with health property a punch(Fighter)
        // also add a toString method

        // declare two fighters and do some punching!
        Fighter bob = new Fighter();
        Fighter tom = new Fighter();
        bob.punch(tom);

        System.out.println("Bob: " + bob);
        System.out.println("Tom: " + tom);

        // make subclass/subtype of Fighter called Ninja
        // explain inheritance and why it is awesome

        Ninja sue = new Ninja();
        System.out.println("Sue: " + sue);
        sue.punch(tom);
        System.out.println(tom);

        // explain superclass/supertype

        // add a ninja-cool attack: throwShuriken

        // fight some more
        sue.throwShuriken(tom);
        sue.throwShuriken(bob);
        System.out.println("Tom: " + tom);
        System.out.println("Bob: " + bob);

        // protected int health from fighter class allows to call throughout package
        System.out.println(bob.health);

        bob.taunt();
        sue.taunt();

        // creating an array of Fighters
        Fighter [] arena = new Fighter[4];
        arena[0] = new Fighter();
        arena[1] = new Fighter();
        arena[2] = new Fighter();
        arena[3] = new Ninja();

        for (Fighter fighter : arena) {
            if (fighter instanceof Ninja) {
                ((Ninja) fighter).throwShuriken(tom);
            } else {
                fighter.punch(tom);
            }
        }


    }
}
