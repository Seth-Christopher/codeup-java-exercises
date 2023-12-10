public class HelloWorld {

    public static void main(String[] args){

        String animal = "Dog";
        String breed = "ShibaDoodle";
        int weight = 70;
        boolean cuteOrNot = false;
        cuteOrNot = false;
        String name = "Monster Turtle";
        System.out.println("Hello Cruel World..");

        System.out.printf("I have a pet %s, her name is Oakley and she is a %s%n", animal, breed);


        System.out.println("riddle me this..");
        if (cuteOrNot) {
            System.out.print(name + " is cute ");
        } else {
            System.out.println(name + " is mean looking");
        }
    }
}

