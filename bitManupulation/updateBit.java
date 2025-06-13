package bitManupulation;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oper = sc.nextInt();

        int n = 5;
        int pos = 1;

        if (oper == 1) {
            int bitmas = 1 << pos;
            System.out.println(bitmas | n);

        } else {
            int bitmas = ~(1 << pos);

            System.out.println(bitmas & n);
        }
        sc.close();
    }
}
