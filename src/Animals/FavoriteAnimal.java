package Animals;

public class FavoriteAnimal {

    private String favAnimal;
    private String animalSound;


    public void setFavAnimal(String favAnimal){
        this.favAnimal = favAnimal;
    }
    public void setAnimalSound(String animalSound){
        this.animalSound = animalSound;
    }




    FavoriteAnimal() {

    }

    public String makeNoise(){
        return String.format(
                "The %s goes, %s!!!!",

                favAnimal, animalSound
        );
    }
    public FavoriteAnimal(String favAnimal, String animalSound){
        this.favAnimal = favAnimal;
        this.animalSound = animalSound;
    }
}
