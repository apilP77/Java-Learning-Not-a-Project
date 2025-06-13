package bitManupulation;

public class q3 {
    public static void main(String[] args) {
        // number of one

        int n = 15;
        int pos;
        int bitmas;
        int count = 0;

        for (int i = 0; i <= 4; i++) {

            pos = i;

            bitmas = 1 << pos;

            if ((bitmas & n) != 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
