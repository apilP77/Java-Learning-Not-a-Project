import java.util.*;

public class addFunction {
    public static int addTwoNumber(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Eneter two numbers");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int z = addTwoNumber(x, y);
        System.out.println(z);
        sc.close();
    }
}
