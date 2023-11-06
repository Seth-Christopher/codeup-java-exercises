public class Person {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean sayHello(){
        System.out.println("Hello " + name);
        return false;
    }


    public static void main(String[] args) {
        Person gobirds = new Person();

        gobirds.name("Go Birds");

        System.out.println(gobirds.sayHello());
    }

    private void getName(String goBirds) {

    }
}
