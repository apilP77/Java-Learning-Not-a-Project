package String;

public class subString {
    public static void main(String[] args) {

        String name = "My name is Tony Stark";

        String sub = name.substring(0, 5);// beginning to end-1

        System.out.println(sub);

        sub = name.substring(9);// beigning will be 0 and ending will be 9-1 as defualt
        System.out.println(sub);
    }
}
