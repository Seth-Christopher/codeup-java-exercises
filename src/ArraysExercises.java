public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        // created a Person class that will be our Object array and will hold 3 Person objects
        class Person {
            // created our two private variables for the objects
            private String name;
            private int age;

            // initializing what our Person arguments are (String name, and int age)
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // our getName method(function)
            public String getName() {
                return name;
            }

            // our getAge method(function)
            public int getAge() {
                return age;
            }
        }

        // below is where we actually create our Persons Object Array. we give it the name of 'people': we are also stating that the new Person[3] Object will be 3 objects in length.
        Person[] people = new Person[3];

        // we then start creating the objects at people[0] ---> index 0
        people[0] = new Person("Jon Gotti", 33);
        people[1] = new Person("Dr Dre", 2001);
        people[2] = new Person("Big Snoop", 66);

        // running an enhanced for loop to iterate through the Objects array. and then printing to the console.
        for (Person folks : people) {
            System.out.printf("NAME: %s%n AGE: %d%n", folks.getName(), folks.getAge());
        }


    }
}