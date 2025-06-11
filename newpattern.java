public class newpattern {
    public static void main(String[] args) {
        int b = 5;

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= b - i; j++) {
                System.err.print(" ");
            }
            for (int j = 0; j <= 5; j++) {
                System.err.print("*");

            }
            System.err.println();
        }
    }
}
