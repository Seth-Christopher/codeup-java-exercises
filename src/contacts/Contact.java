package contacts;

import java.util.Arrays;

public class Contact {

//    public String name;
//    public String mobile;
//    public String email;

    // instead of using public classes , we normally should make them private like below:

    private static int totalContacts;
    private String name;
    private String phoneNumber;
    private String email;

    public static int getTotalContacts(){
        return totalContacts;
    }
    // setter
    // technical name: "mutator"
    public void setName(String name){
        this.name = name;
    }

    // getter
    // technical name: "accessor"
    public String getName(){
        return name;
    }
    public void setMobile(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "";
        }
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }


    public String checkNull(String contactProperty){
        return contactProperty == null ? "" : contactProperty;
    }

    public String display(){
        return String.format(
                "Name: %s%n" +
                "Mobile: %s%n" +
                "Email: %s%n",
                    // instead of using the same ternary multiple times , we can use the checkNull method we created above
//                name, phoneNumber == null ? "" : phoneNumber, email == null ? "" : email
                name, checkNull(phoneNumber), checkNull(email)
        );
    }

    // ArrayLecture
    public static Contact[] addContact (Contact[] contacts, Contact newContact){
        Contact[] updatedContacts = Arrays.copyOf(contacts, contacts.length + 1);
        updatedContacts[updatedContacts.length - 1] = newContact;
        return updatedContacts;
    }
    public Contact() {
        totalContacts++;
    }

    public Contact(String name, String phoneNumber, String email){
        totalContacts++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
