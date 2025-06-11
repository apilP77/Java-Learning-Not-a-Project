import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("Enter a number from 1 to 3");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Namasta");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjure");
                break;

            default:
                System.out.println("The Input is Error");
                break;
        }
    }
}
