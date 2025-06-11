public class pattern {
    public static void main(String[] args) {

        int a = 4;
        int b = 4;
        int n = 1;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i >= j) {
                    System.out.print(n % 2);
                } else {
                    System.out.print(" ");
                }
                n++;

            }
            System.out.println();
        }
    }
}
