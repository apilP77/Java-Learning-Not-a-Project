package String;

public class lengthAndEveryChar {
    public static void main(String[] args) {

        String firstName = "Tony";
        String lastName = "Stark";

        String fullName = firstName + " " + lastName;

        System.out.println("The Full name is " + fullName);
        System.out.println("The total Number of chacter in the Full name is" + fullName.length());

        // printing every chacter

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));

        }
    }
}
