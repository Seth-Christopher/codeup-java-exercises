import contacts.Contact;

import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {
        // declare an array that holds 5 integers
        int[] numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 35;
        numbers[2] = -762;
        numbers[3] = 257;
        numbers[4] = 323;

        // grabbing the index of 0 from numbers array
        System.out.println(numbers[0]);

        // Arrays.sort will sort the array from lowest to highest values
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        numbers[2] = 453243;
        System.out.println(numbers[2]);
        // looping over numbers array with enhanced for loop
        for (int nums : numbers) {
            System.out.println(nums);
        }


        // array initializer syntax
        String[] myStrings = {"random", "word", "repository", "idea", "input"};

        // looping over an array with a for loop
        for (int i = 0; i < myStrings.length; i++) {
            System.out.println(myStrings[i]);
        }

        // looping over an array with an enhanced for loop
        for (String string : myStrings) {
            System.out.println(string);
        }

        Contact mikeHoncho = new Contact("Mike Honcho", "2103945424", "Honcho@honchi.com");
        Contact rickyBobby =new Contact("Ricky Bobby", "9876543210", "goFastorDie@taladega.com");
        Contact shakira = new Contact("Shakira Shakira", "200497734234", "hipsdontlie@brokenhips.com");

        Contact[] contacts = {mikeHoncho, rickyBobby, shakira};

        Contact britany = new Contact("Britany", "5042328475", "hitmeonemoretime@brit.com");
        contacts =  Contact.addContact(contacts, britany);

        for (Contact contact : contacts){
            System.out.printf("Name: %s%n", contact.getName());
            System.out.printf("Phone: %s%n", contact.getMobile());
            System.out.println(" ");
        }



    }
}
