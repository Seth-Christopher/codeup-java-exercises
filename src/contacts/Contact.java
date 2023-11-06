package contacts;

public class Contact {

//    public String name;
//    public String mobile;
//    public String email;

    // instead of using public classes , we normally should make them private like below:

    private String name;
    private String mobile;
    private String email;

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
    public void setMobile(String mobile) {
        if (mobile.length() == 10) {
            this.mobile = mobile;
        } else {
            this.mobile = "";
        }
    }

    public String getMobile(){
        return mobile;
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
//                name, mobile == null ? "" : mobile, email == null ? "" : email
                name, checkNull(mobile), checkNull(email)
        );
    }

    public Contact(){
        System.out.println("New contact!");
    }

    public Contact(String name, String mobile, String email){
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }
}
