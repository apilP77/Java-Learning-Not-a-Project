public class hardestsolosolve {
    public static void main(String[] args) {

        int a = 4;
        int b = 8;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (j <= i || j >= 8 - (i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for (int i = a; i >= 0; i--) {
            for (int j = b; j >= 0; j--) {
                if (j <= i || j >= 8 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
