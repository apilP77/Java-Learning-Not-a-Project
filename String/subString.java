package String;

public class subString {
    public static void main(String[] args) {

        String name = "My name is Tony Stark";

        String sub = name.substring(0, 5);// beginning to end-1

        System.out.println(sub);

        sub = name.substring(9);// beigning will be 9 and ending is upto last
        System.out.println(sub);
    }
}
