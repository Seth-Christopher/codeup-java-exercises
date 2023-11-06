package contacts;

public class ContactTest {
    public static void main(String[] args) {
        // instantiate an object
        // declaring a reference variable
        // creating a new object
        // assigning the object to the reference variable

        Contact javier = new Contact();
//        javier.name = "Javier";
//        javier.mobile = "2102341144";
//        javier.email = "javier@google.com";
        //we are running a method that sets a parameter
        javier.setName("Javier");
        javier.setMobile("2342905434");
        javier.setEmail("meh@whater.com");


        // contact () is a kind of method called constructor
        //invoke a constructer with the keyword "new"
        // followed by the name of a class, parens, and a semicolon


        Contact ibm = new Contact();
//        ibm.name = "IBM";
//        ibm.mobile = "5412342222";
//        ibm.email = "contact@ibm";
        //
        ibm.setName("IBM");
        ibm.setMobile("18002342255");
        ibm.setEmail("img@ibm.com");


        Contact mikeHoncho = new Contact(
                "Mike Honcho",
                "5123335937",
                "mikesHoncho@taladega.com");

        System.out.println(javier.display());

        System.out.println(ibm.display());

        System.out.println(mikeHoncho.display());
//        System.out.println(javier);

        ;
    }
}
