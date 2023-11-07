import util.Input;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        String theString = input.getString();
        System.out.println(theString);

        boolean userChoice = input.yesNo();
        System.out.println(userChoice);

        int userNumber = input.getInt(1, 4);
        System.out.println(userNumber);

        System.out.println(input.getInt());

        System.out.println(input.getDouble(4.5, 9.6));

        System.out.println(input.getDouble());


    }



}
