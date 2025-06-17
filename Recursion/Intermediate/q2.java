package Intermediate;

public class q2 {
    public static void rev(String n, String rev) {
        if (n.length() == 0) {
            System.out.println(rev);
            return;
        }
        rev = rev + n.charAt(n.length() - 1);
        n = n.substring(0, n.length() - 1);
        rev(n, rev);
    }

    public static void main(String[] args) {
        rev("hello", "");
    }
}
