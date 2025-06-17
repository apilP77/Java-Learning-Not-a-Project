// power 

package basic;

import java.util.Scanner;

public class q6 {
    public static int pow(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pow(x, y - 1);
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
