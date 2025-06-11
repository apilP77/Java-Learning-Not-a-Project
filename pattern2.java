public class pattern2 {
    public static void main(String[] args) {

        int a = 4;
        int b = 4;

        for (int i = a; i >= 0; i--) {
            for (int j = 0; j <= b; j++) {
                if (i >= j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
