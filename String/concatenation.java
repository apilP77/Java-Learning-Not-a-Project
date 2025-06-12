package String;

import java.util.*;

public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter First Name");
        String firstName = sc.next();

        System.out.println("Enter Last Name");
        String lastName = sc.next();

        // concatenation

        System.out.println("The Full Name is " + firstName + " " + lastName);
        sc.close();
    }
}
