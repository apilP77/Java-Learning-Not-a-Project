package adavnce;

public class q3 {
    public static int counts(int n, int m) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int onestep = counts(n - 1, m);
        int mstep = counts(n - m, m);

        return onestep + mstep;
    }

    public static void main(String[] args) {
        System.out.println(counts(4, 2));
    }
}
