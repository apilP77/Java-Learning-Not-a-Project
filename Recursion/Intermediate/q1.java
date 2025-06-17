package Intermediate;

public class q1 {
    public static void towerOfhanoi(int n, String src, String helper, String det) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + "From " + src + "to " + det);
            return;
        }
        towerOfhanoi(n - 1, src, det, helper);
        System.out.println("Transfer Disk " + n + " From " + src + "to " + det);
        towerOfhanoi(n - 1, helper, src, det);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfhanoi(n, "S", "H", "D");
    }

}
