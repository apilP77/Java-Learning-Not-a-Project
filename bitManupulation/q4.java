package bitManupulation;

import java.util.Scanner;

public class q4 {
    public static void binarytoDecimal() {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();
        int dec = 0;

        for (int i = 0; i < bin.length(); i++) {
            dec = dec << 1;
            if (bin.charAt(i) == '1') {
                dec = dec | 1;

            }
        }
        System.err.println(dec);
        sc.close();
        return;

    }

    public static void decimalToBinary() {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        if (dec == 0) {
            System.out.println("The Binary is 0");
            sc.close();
            return;
        }
        String bin = "";

        while (dec > 0) {

            if ((dec & 1) == 1) {
                bin = "1" + bin;

            } else {
                bin = "0" + bin;
            }
            dec = dec >> 1;

        }
        System.out.println("The binary is " + bin);
        sc.close();
        return;
    }

    public static void main(String[] args) {

        System.out.println("Enter 1 for binary and 2 for decimal");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 1) {
            binarytoDecimal();
        } else if (x == 2) {
            decimalToBinary();
        } else {
            System.out.println("Wrong input");

        }
        sc.close();
    }
}
