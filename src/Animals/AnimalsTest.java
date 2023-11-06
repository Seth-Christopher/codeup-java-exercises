package Animals;

public class AnimalsTest {
    public static void main(String[] args) {

        FavoriteAnimal lion = new FavoriteAnimal();

//        lion.favAnimal = "Lion";
//        lion.animalSound = "Roar";

        FavoriteAnimal deerbra = new FavoriteAnimal(
                "Deerbra",
                "snortsnifffart");

        lion.setFavAnimal("Liger");
        lion.setAnimalSound("Rawr");

        System.out.println(lion.makeNoise());
        System.out.println(deerbra.makeNoise());
        System.out.println();


    }
}
