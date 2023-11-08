public class Persontest {

    public static void main(String[] args){
        Person seth = new Person("Seth");
        seth.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("Smith");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        System.out.println(person2.getName());
        System.out.println(person2);
        person2 = person1;
        System.out.println(person2 == person1);
        System.out.println(person1);
        System.out.println(person2);
    }
}
