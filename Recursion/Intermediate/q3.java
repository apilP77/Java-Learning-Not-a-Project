package Intermediate;

public class q3 {
    public static int first = -1;
    public static int last = -1;

    public static void occ(String s, int index, char element) {
        if (s.length() != index) {
            char b = s.charAt(index);
            if (b == element) {
                if (first == -1) {
                    first = index;

                } else {
                    last = index;
                }

            }
            occ(s, index + 1, element);
        } else {
            System.out.println("The first and last occuranace is at " + first + " and " + last);
            return;
        }
    }

    public static void main(String[] args) {
        occ("hehehehehehhehe", 0, 'e');
    }
}
