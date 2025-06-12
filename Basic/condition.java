import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("He is Eligibale for voteing");
        } else {
            System.out.println("He is not Eligiable for voting sorry");
        }
        sc.close();

    }
}
