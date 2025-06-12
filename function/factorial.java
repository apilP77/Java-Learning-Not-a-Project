import java.util.Scanner;

public class factorial {
    public static int fact(int x) {
        if (x == 1 || x == 0) {
            return 1;

        } else {
            return x * fact(x - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println(" Enter a Number");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int z = fact(a);
        System.out.println(z);
        sc.close();
    }
}
