package basic;

import java.util.Scanner;

public class q6_diffMethod {
    public class q6 {
        public static int pow(int x, int y) {
            if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                return pow(x, y / 2) * pow(x, y / 2);
            } else {
                return x * pow(x, y / 2) * pow(x, y / 2);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int base = sc.nextInt();
            int power = sc.nextInt();

            System.out.println(pow(base, power));
            sc.close();

        }
    }
}