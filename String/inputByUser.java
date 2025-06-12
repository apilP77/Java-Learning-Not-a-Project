package String;

import java.util.Scanner;

public class inputByUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fullName = sc.nextLine(); // Next whole line until user presses enter

        System.out.println(fullName);
        sc.close();
    }
}
