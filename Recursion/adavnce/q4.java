package adavnce;

public class q4 {
    public static int wayToInvite(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        int singleInvite = wayToInvite(n - 1);
        int pairInvite = wayToInvite(n - 2) * (n - 1);

        return singleInvite + pairInvite;
    }

    public static void main(String[] args) {
        System.out.println(wayToInvite(4));
    }
}
