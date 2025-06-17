package Intermediate;

public class q5 {
    public static void move(String n, int index, int count, String neww) {
        if (n.length() != index) {
            if (n.charAt(index) == 'x') {
                count++;
                move(n, index + 1, count, neww);
            } else {
                neww += n.charAt(index);
                move(n, index + 1, count, neww);
            }

        } else {
            for (int i = 0; i < count; i++) {
                neww += 'x';

            }
            System.out.println(neww);
            return;
        }
    }

    public static void main(String[] args) {
        move("hxhxhhxhxhx", 0, 0, "");
    }
}
