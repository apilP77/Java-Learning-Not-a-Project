package adavnce;

public class q2 {

    public static int paths(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;

        }
        if (i == n || j == m) {
            return 0;

        }
        int down = paths(n, m, i + 1, j);
        int right = paths(n, m, i, j + 1);

        return down + right;
    }

    public static void main(String[] args) {
        System.out.println(paths(3, 3, 0, 0));
    }
}
